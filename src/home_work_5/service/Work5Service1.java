package home_work_5.service;
import home_work_5.service.comparator.EntryComparator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Work5Service1 {
    public void run() {
        String text;
        try {
            text = Files.readString(Path.of("src/home_work_5/books/Война и мир_книга.txt"));
        } catch (IOException e) {
            throw new IllegalStateException("Неудалось прочитать файла");
        }

        String[] words = text.split(" +");

        System.out.println("Количество используемых слов: " + words.length);


        Map<String, Integer> statistics = new HashMap<>();

//        for (String word : words) {
//            if(statistics.containsKey(word)){
//                Integer countUseOfWord = statistics.get(word);
//                countUseOfWord++;
//                statistics.put(word, countUseOfWord);
//            } else {
//                statistics.put(word, 1);
//            }
//        }

//        for (String word : words) {
//            Integer countUseOfWord = statistics.get(word);
//            if(countUseOfWord == null){
//                countUseOfWord = 0;
//            }
//            statistics.put(word, ++countUseOfWord);
//        }

        for (String word : words) {
            Integer countUseOfWord = statistics.getOrDefault(word, 0);
            statistics.put(word, ++countUseOfWord);
        }

//        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        Set<String> uniqueWords = statistics.keySet();

        System.out.println("Количество уникальных слов: " + uniqueWords.size());

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(statistics.entrySet());

        Comparator<Map.Entry<String, Integer>> entryComparator = new EntryComparator();
        Comparator<Map.Entry<String, Integer>> reversed = entryComparator.reversed();

        entries.sort(reversed);

        int index = 0;

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            if(++index > 10){
                break;
            }
        }
    }
}
