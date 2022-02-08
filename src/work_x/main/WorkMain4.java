package work_x.main;

import work_x.service.WorkService2;
import work_x.service.comparators.StudentAgeComparator;
import work_x.service.comparators.StudentNameComparator;
import work_x.service.comparators.StudentScoreComparator;
import work_x.service.generators.StringFromFileStringGenerator;
import work_x.service.predicates.StudentAgeAndScorePredicate;
import work_x.service.printer.StudentGroupAgeTopPrinter;
import work_x.service.printer.StudentTopPrinter;
import work_x.service.suppliers.StudentSupplier;

public class WorkMain4 {
    public static void main(String[] args) {
        WorkService2 service = new WorkService2();
        long start = System.currentTimeMillis();
        service.run(new StudentSupplier(new StringFromFileStringGenerator(
                        "names.txt", true
                )),
                100_000, new StudentAgeAndScorePredicate(),
                new StudentTopPrinter("Топ-10 по имени: ", 10), new StudentNameComparator(),
                new StudentTopPrinter("Топ-10 по оценке: ", 10), new StudentScoreComparator().reversed(),
                new StudentGroupAgeTopPrinter("Топ-10 в каждом возрасте: ", 10), new StudentAgeComparator().thenComparing(new StudentScoreComparator().reversed())
        );
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
    }
}
