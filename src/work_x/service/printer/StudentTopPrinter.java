package work_x.service.printer;

import work_x.dto.Student;
import work_x.service.printer.api.ITopPrinter;

import java.util.Comparator;
import java.util.List;

public class StudentTopPrinter implements ITopPrinter<Student> {

    private int count;
    private String message;

    public StudentTopPrinter(String message, int count) {
        this.count = count;
        this.message = message;
    }

    @Override
    public void print(List<Student> data, Comparator<Student> comparator) {
        System.out.println(message);
        data.sort(comparator);

        int index = 0;
        for (Student element : data) {
            System.out.println(element);
            if(++index > count){
                break;
            }
        }
    }
}
