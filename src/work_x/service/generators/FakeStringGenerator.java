package work_x.service.generators;

import work_x.service.generators.api.IStringGenerator;

public class FakeStringGenerator implements IStringGenerator {
    @Override
    public String generate(int minCount, int maxCount) {
        return "Антоны";
    }
}
