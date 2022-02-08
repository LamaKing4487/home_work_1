package work_x.service.generators;

import work_x.service.generators.api.IStringGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class RussianNameStringGenerator implements IStringGenerator {

    private String[] names;

    public RussianNameStringGenerator() {
        names = new String[]{"111", "Антон", "Иван", "Алеся"};
    }

    public RussianNameStringGenerator(String[] names) {
        this.names = names;
    }

    @Override
    public String generate(int minCount, int maxCount) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        int maxCharCount = rnd.nextInt(minCount, maxCount + 1);
        int maxAttemp = rnd.nextInt(10);

        String result = null;

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
