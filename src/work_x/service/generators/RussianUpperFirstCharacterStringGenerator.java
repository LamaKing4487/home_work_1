package work_x.service.generators;

import work_x.service.generators.api.IStringGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class RussianUpperFirstCharacterStringGenerator implements IStringGenerator {
    @Override
    public String generate(int minCount, int maxCount) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        int maxCharCount = rnd.nextInt(minCount, maxCount + 1);

        String result = "";
        for (int i = 0; i < maxCharCount; i++) {
            char symbol = (char) rnd.nextInt(1040, 1072);
            if(i != 0){
                result += Character.toLowerCase(symbol);
            } else {
                result += symbol;
            }
        }

        return result;
    }
}
