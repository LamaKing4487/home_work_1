package work_x.service;

import work_x.dto.Student;
import work_x.service.comparators.StudentAgeAndScoreComparator;
import work_x.service.comparators.StudentAgeComparator;
import work_x.service.comparators.StudentNameComparator;
import work_x.service.comparators.StudentScoreComparator;
import work_x.service.generators.api.IStringGenerator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class WorkService {

    public void run(int countStudent, IStringGenerator nameGenerator){
        List<Student> data = new ArrayList<>();

        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < countStudent; i++) {
            Student student = new Student();
            //Генерация рандомных значений
            student.setNumber(i);
            student.setName(nameGenerator.generate(3, 10));
            student.setAge(random.nextInt(7, 17));
            student.setScore(random.nextDouble(10));
            student.setOlympicGamer(random.nextBoolean());
            //
            data.add(student);
        }

        List<Student> filtered = new ArrayList<>();

        for (Student element : data) {
            if(element.getAge() >= 12 && element.getScore() > 8){
                filtered.add(element);
            }
        }

        double sumAge = 0;

        for (Student element : filtered) {
            sumAge += element.getAge();
        }

        System.out.println("Средний возраст " + (sumAge / filtered.size()));

        System.out.println("Топ-10 по имени: ");
        filtered.sort(new StudentNameComparator());

        int index = 0;
        for (Student element : filtered) {
            System.out.println(element);
            if(++index > 10){
                break;
            }
        }

        Comparator<Student> studentScoreComparator = new StudentScoreComparator().reversed();
        System.out.println("Топ-10 по оценке: ");
        filtered.sort(studentScoreComparator);

        index = 0;
        for (Student element : filtered) {
            System.out.println(element);
            if(++index > 10){
                break;
            }
        }

        System.out.println("Топ-10 в каждом возрасте: ");

        Comparator<Student> studentAgeComparator = new StudentAgeComparator();

        filtered.sort(studentAgeComparator.thenComparing(studentScoreComparator));

        int countInGroup = 0;
        int currentAge = -1;
        for (Student element : filtered) {
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
