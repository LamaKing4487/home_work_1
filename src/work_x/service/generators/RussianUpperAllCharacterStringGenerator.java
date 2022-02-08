package work_x.service.generators;

import work_x.service.generators.api.IStringGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class RussianUpperAllCharacterStringGenerator implements IStringGenerator {
    @Override
    public String generate(int minCount, int maxCount) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        int maxCharCount = rnd.nextInt(minCount, maxCount + 1);

        String result = "";
        for (int i = 0; i < maxCharCount; i++) {
            result += (char) rnd.nextInt(1040, 1072);
        }

        return result;
    }
}
