package mypractice.person;

public class Student extends Person {
    int course = 1;

    public Student (int Height, String name, int course){
        super(Height, name);
        this.course = course;
    }

    void tell (){
        System.out.println(super.height);
        System.out.println(super.name);
        System.out.println(course);
    }
}
