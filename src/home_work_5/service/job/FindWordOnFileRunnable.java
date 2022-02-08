package home_work_5.service.job;
import home_work_5.service.engine.api.ISearchEngine;
import home_work_5.service.job.FindWordOnFileRunnable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
public class FindWordOnFileRunnable implements Runnable{
    private File textFile;
    private String word;
    private ISearchEngine engine;
    private FileWriter writer;

    public FindWordOnFileRunnable(File textFile, String word,
                                  ISearchEngine engine, FileWriter writer) {
        this.textFile = textFile;
        this.word = word;
        this.engine = engine;
        this.writer = writer;
    }

    @Override
    public void run() {
        String text;
        try {
            text = Files.readString(textFile.toPath());
        } catch (IOException e) {
            throw new IllegalArgumentException("Неудалось прочитать файла");
        }

        try {
            writer.write(textFile.getName() + " - " + word + " - " + engine.search(text, word) + "\n");
        } catch (IOException e) {
            throw new RuntimeException("Неудаётся записать результат поиска", e);
        }
    }
}
