package home_work1;

import java.util.Scanner;

public class home_work_7 {
    public static void main(String[] args) {
        System.out.println("введи число и я покажу его в двоичном коде");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int b1 = num;
        String s1 = String.format("%8s", Integer.toBinaryString(b1 & 0xFF)).replace(' ', '0');
        System.out.println(s1);
    }
}
