package work_x.dto;

public class Student {
    private int number;
    private String name;
    private int age;
    private double score;
    private boolean olympicGamer;

    public Student() {
    }

    public Student(int number, String name, int age, double score, boolean olympicGamer) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.score = score;
        this.olympicGamer = olympicGamer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isOlympicGamer() {
        return olympicGamer;
    }

    public void setOlympicGamer(boolean olympicGamer) {
        this.olympicGamer = olympicGamer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", olympicGamer=" + olympicGamer +
                '}';
    }
}
