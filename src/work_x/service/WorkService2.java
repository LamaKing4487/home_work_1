package work_x.service;

import work_x.dto.Student;
import work_x.service.comparators.StudentAgeComparator;
import work_x.service.comparators.StudentNameComparator;
import work_x.service.comparators.StudentScoreComparator;
import work_x.service.generators.api.IStringGenerator;
import work_x.service.printer.api.ITopPrinter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class WorkService2 {

    public void run(Supplier<Student> supplier, int countElement,
                    Predicate<Student> predicate,
                    ITopPrinter<Student> printer1, Comparator<Student> comparator1,
                    ITopPrinter<Student> printer2, Comparator<Student> comparator2,
                    ITopPrinter<Student> printer3, Comparator<Student> comparator3){
        List<Student> data = new ArrayList<>();

        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < countElement; i++) {
            data.add(supplier.get());
        }

        List<Student> filtered = new ArrayList<>();

        for (Student element : data) {
            if(predicate.test(element)){
                filtered.add(element);
            }
        }

//        double sumAge = 0;
//
//        for (Student element : filtered) {
//            sumAge += element.getAge();
//        }
//
//        System.out.println("Средний возраст " + (sumAge / filtered.size()));

        printer1.print(filtered, comparator1);

        printer2.print(filtered, comparator2);

        printer3.print(filtered, comparator3);
    }
}
