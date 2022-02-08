package work_x.main;

import work_x.service.WorkService;
import work_x.service.generators.StringFromFileStringGenerator;

public class WorkMain3 {
    public static void main(String[] args) {
        WorkService service = new WorkService();
        long start = System.currentTimeMillis();
        service.run(100_000, new StringFromFileStringGenerator(
               "names.txt", true
        ));
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
    }
}
