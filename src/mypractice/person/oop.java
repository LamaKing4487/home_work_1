package mypractice.person;

import mypractice.person.Person;
import mypractice.person.Student;

public class oop {
    public static void main(String[] args) {
        Person victor = new Person();
        victor.height = 120;
        victor.say("George");
        System.out.println(victor.height);
        Person vlad = new Person();
        System.out.println(vlad.height);
        System.out.println("");

        Student freshmen = new Student(76, "viktor", 2);
        freshmen.tell();

    }
}
