package home_work_2;

import java.util.Scanner;

public class home_work_1_3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите число");
        double num1 = scan.nextDouble();
        System.out.println("введите второе число");
        int num2 = scan.nextInt();
        System.out.println(Math.pow(num1, num2));

    }
}
