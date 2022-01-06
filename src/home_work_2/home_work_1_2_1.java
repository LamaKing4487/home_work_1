package home_work_2;

import java.util.Arrays;
import java.util.Scanner;

public class home_work_1_2_1 {
    public static void main(String[] args) {
        Scanner concole = new Scanner(System.in);
        System.out.println("введите число");


        int[] num = new int[concole.nextInt()];

        for (int i = 0; i < num.length; i++) {
            System.out.println("введите число?");

            num[i] = concole.nextInt();
        }long sum = 1;
        for (int item : num) {
            sum *= item;
        }

        System.out.println(Arrays.toString(num) + " = " + sum);
    }

}
