package home_work1;

public class home_work_2 {
    public static void main(String[] args) {
        double a = 8;
        int b = 2;
        System.out.println(5 + 2 / a);
        System.out.println((5 + 2) / a);
        System.out.println((5 + b++) / a);
        System.out.println((5 + b++) / --a);
        System.out.println((5 * 2 >> b++) / --a);
        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --a);
        System.out.println(6 - 2 > 3 && 12 * 12 <= 119);
    }
}
