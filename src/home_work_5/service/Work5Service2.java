package home_work_5.service;
import home_work_5.service.comparator.EntryComparator;
import home_work_5.service.engine.EasySearch;
import home_work_5.service.engine.api.ISearchEngine;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
public class Work5Service2 {
    public void run(ISearchEngine engine) {
        String text;
        try {
            text = Files.readString(Path.of("src/home_work_5/books/Война и мир_книга.txt"));
        } catch (IOException e) {
            throw new IllegalStateException("Неудалось прочитать файла");
        }

        long count1 = engine.search(text, "и");
        long count2 = engine.search(text, "война");
        long count3 = engine.search(text, "мир");

        System.out.println("и : " + count1);
        System.out.println("война : " + count2);
        System.out.println("мир : " + count3);
    }
}
