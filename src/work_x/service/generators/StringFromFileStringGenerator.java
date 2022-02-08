package work_x.service.generators;

import work_x.service.generators.api.IStringGenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ThreadLocalRandom;

public class StringFromFileStringGenerator implements IStringGenerator {

    private String filePath;
    private String[] names;

    /**
     * Конструктор, сохраняет данные прочитанные из файла в память
     * @param filePath файл из которого нужно прочитать имена, разделённые переводом строки
     */
    public StringFromFileStringGenerator(String filePath) {
        this(filePath, true);
    }

    /**
     * Конструктор
     * @param filePath файл из которого нужно прочитать имена, разделённые переводом строки
     * @param saveToMemory сохранять ли данные в память
     */
    public StringFromFileStringGenerator(String filePath, boolean saveToMemory) {
        this.filePath = filePath;
        if(saveToMemory){
            this.names = readFile();
        }
    }

    private String[] load(){
        if(names == null){
            return readFile();
        }
        return names;
    }

    private String[] readFile(){
        try {
            return Files.readString(Path.of(filePath)).split("\r\n");
        } catch (IOException e) {
            throw new IllegalArgumentException("Ошибка чтения файла");
        }
    }

    @Override
    public String generate(int minCount, int maxCount) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        int maxCharCount = rnd.nextInt(minCount, maxCount + 1);
        int maxAttemp = rnd.nextInt(10);

        String result = null;

        String[] names = load();

        for (String name : names) {
            if(name.length() >= minCount && name.length() <= maxCharCount){
                result = name;
                if(maxAttemp-- == 0){
                    break;
                }
            }
        }

        if(result == null){
            throw new IllegalStateException("Мы не смогли сгенерировать нужное имя");
        }

        return result;
    }
}
