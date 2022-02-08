package work_x.service.printer;

import work_x.dto.Student;
import work_x.service.printer.api.ITopPrinter;

import java.util.Comparator;
import java.util.List;

public class StudentGroupAgeTopPrinter implements ITopPrinter<Student> {

    private int count;
    private String message;

    public StudentGroupAgeTopPrinter(String message, int count) {
        this.count = count;
        this.message = message;
    }

    @Override
    public void print(List<Student> data, Comparator<Student> comparator) {
        System.out.println(message);
        data.sort(comparator);

        int countInGroup = 0;
        int currentAge = -1;
        for (Student element : data) {
            if(currentAge != element.getAge()){
                currentAge = element.getAge();
                countInGroup = 0;
            }
            if(++countInGroup <= 10){
                System.out.println(element);
            }
        }
    }
}
