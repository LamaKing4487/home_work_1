package work_x.service.predicates;

import work_x.dto.Student;

import java.util.function.Predicate;

public class StudentAgeAndScorePredicate implements Predicate<Student> {
    @Override
    public boolean test(Student student) {
        return student.getAge() >= 12 && student.getScore() > 8;
    }
}
