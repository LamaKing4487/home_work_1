package work_x.service.generators;

import work_x.service.generators.api.IStringGenerator;

import java.util.concurrent.ThreadLocalRandom;

public class RussianFromArrayCharacterStringGenerator implements IStringGenerator {
    @Override
    public String generate(int minCount, int maxCount) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();

        char[] allowSymbols = new char['я' - 'а' + 1];

        for (int i = 0, j = 'а'; j <= 'я'; i++, j++) {
            allowSymbols[i] = (char) j;
        }

        allowSymbols[allowSymbols.length - 1] = 'ё';

        int maxCharCount = rnd.nextInt(minCount, maxCount + 1);
        String result = "";
        for (int i = 0; i < maxCharCount; i++) {
            char symbol = allowSymbols[rnd.nextInt(allowSymbols.length)];
            if(i != 0){
                result += symbol;
            } else {
                result += Character.toUpperCase(symbol);
            }
        }

        return result;
    }
}
