package work_x.main;

import work_x.service.WorkService;
import work_x.service.generators.RussianNameStringGenerator;

public class WorkMain2 {
    public static void main(String[] args) {
        WorkService service = new WorkService();
        service.run(10_000, new RussianNameStringGenerator());
    }
}
