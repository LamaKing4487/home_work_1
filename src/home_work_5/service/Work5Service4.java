package home_work_5.service;
import home_work_5.service.engine.api.ISearchEngine;
import home_work_5.service.job.FindWordOnFileRunnable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
public class Work5Service4 {
    public void run(ISearchEngine engine, String directoryPath) {

        Path path = Path.of(directoryPath);
        File[] textFiles = path.toFile().listFiles((dir, name) -> name.endsWith(".txt"));
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Scanner console = new Scanner(System.in);

        List<Future<?>> futures = new ArrayList<>();

        try (FileWriter saveResultTo = new FileWriter("result.txt", true)){

            do {
                System.out.println("Укажите слово для поиска");
                String word = console.nextLine();

                if("".equals(word)){
                    break;
                }

                for (File textFile : textFiles) {
                    futures.add(executorService.submit(new FindWordOnFileRunnable(textFile, word, engine, saveResultTo)));
                }
            } while (true);

            while (futures.size() > 0){
                futures.removeIf(i -> i.isDone());
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    break;
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Проблемы с файлом result.txt", e);
        }

        executorService.shutdown();
    }
}
