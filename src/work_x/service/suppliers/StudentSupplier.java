package work_x.service.suppliers;

import work_x.dto.Student;
import work_x.service.generators.api.IStringGenerator;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class StudentSupplier implements Supplier<Student> {

    private IStringGenerator generator;
    private ThreadLocalRandom random = ThreadLocalRandom.current();
    private int count;

    public StudentSupplier(IStringGenerator generator) {
        this.generator = generator;
    }

    @Override
    public Student get() {
        Student student = new Student();
        //Генерация рандомных значений
        student.setNumber(++count);
        student.setName(generator.generate(3, 10));
        student.setAge(random.nextInt(7, 17));
        student.setScore(random.nextDouble(10));
        student.setOlympicGamer(random.nextBoolean());

        return student;
    }

    public int getCount() {
        return count;
    }
}
