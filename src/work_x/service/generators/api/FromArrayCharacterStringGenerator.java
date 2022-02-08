package work_x.service.generators.api;

import java.util.concurrent.ThreadLocalRandom;

public class FromArrayCharacterStringGenerator implements IStringGenerator {

    public final char[] allowSymbols;

    public FromArrayCharacterStringGenerator(char[] allowSymbols) {
        this.allowSymbols = allowSymbols;
    }

    @Override
    public final String generate(int minCount, int maxCount) {
        ThreadLocalRandom rnd = ThreadLocalRandom.current();

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
