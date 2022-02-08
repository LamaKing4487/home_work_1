package work_x.service.comparators;

import work_x.dto.Student;

import java.util.Comparator;

public class StudentAgeAndScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int ageCompare = o1.getAge() - o2.getAge();
        if(ageCompare != 0){
            return ageCompare;
        }

        return Double.compare(o1.getScore(), o2.getScore());
    }
}
