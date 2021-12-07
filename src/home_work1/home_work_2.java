package home_work1;

public class home_work_2 {
    public static void main(String[] args) {
        double a = 8;
        int b = 2;
        System.out.println(5 + 2 / a);
        System.out.println((5 + 2) / a);
        int left = 5 + b++;
        System.out.println((left) / a);
        int left1 = 5 + b++;
        System.out.println((left1) / --a);
        int left2 = 5 * 2 >> b++;
        System.out.println((left2) / --a);
        int left3 = 5 + 7 > 20 ? 68 : 22 * 2;
        int left4 = (left3 >> b++);
        System.out.println(left4 / --a);

    }
}
