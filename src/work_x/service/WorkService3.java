package work_x.service;

import work_x.dto.Student;
import work_x.service.printer.api.ITopPrinter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class WorkService3<T> {

    public void run(Supplier<T> supplier, int countElement,
                    Predicate<T> predicate,
                    ITopPrinter<T> printer1, Comparator<T> comparator1,
                    ITopPrinter<T> printer2, Comparator<T> comparator2,
                    ITopPrinter<T> printer3, Comparator<T> comparator3){
        List<T> data = new ArrayList<>();

        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < countElement; i++) {
            data.add(supplier.get());
        }

        List<T> filtered = new ArrayList<>();

        for (T element : data) {
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
