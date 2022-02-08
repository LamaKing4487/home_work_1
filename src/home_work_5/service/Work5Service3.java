package home_work_5.service;
import home_work_5.service.engine.api.ISearchEngine;
import home_work_5.service.job.FindWordOnFileRunnable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
public class Work5Service3 {
    public void run(ISearchEngine engine, String directoryPath) {

        Path path = Path.of(directoryPath);
        File[] textFiles = path.toFile().listFiles((dir, name) -> name.endsWith(".txt"));
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        FileWriter saveResultTo = null;
        try{
            try {
                saveResultTo = new FileWriter("result.txt", true);
            } catch (IOException e) {
                throw new IllegalStateException("Проблемы с файлом result.txt", e);
            }


            String word = "и";

            List<Future<?>> futures = new ArrayList<>();
            for (File textFile : textFiles) {
                futures.add(executorService.submit(new FindWordOnFileRunnable(textFile, word, engine, saveResultTo)));
            }

            while (futures.size() > 0){
                futures.removeIf(i -> i.isDone());
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    break;
                }
            }
        } finally {
            if(saveResultTo != null){
                try{
                    saveResultTo.flush();
                    saveResultTo.close();
                } catch (IOException e){
                    throw new RuntimeException("Ошибка завершения работы с файлом", e);
                }
            }
        }

        executorService.shutdown();
    }
}
