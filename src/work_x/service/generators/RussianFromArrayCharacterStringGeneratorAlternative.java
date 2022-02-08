package work_x.service.generators;

import work_x.service.generators.api.FromArrayCharacterStringGenerator;
import work_x.service.generators.api.IStringGenerator;

public class RussianFromArrayCharacterStringGeneratorAlternative extends FromArrayCharacterStringGenerator implements IStringGenerator {

    private static final char[] allowSymbols;

    static {
        allowSymbols = new char['я' - 'а' + 1];

        for (int i = 0, j = 'а'; j <= 'я'; i++, j++) {
            allowSymbols[i] = (char) j;
        }

        allowSymbols[allowSymbols.length - 1] = 'ё';
    }

    public RussianFromArrayCharacterStringGeneratorAlternative() {
        super(allowSymbols);
    }
}
