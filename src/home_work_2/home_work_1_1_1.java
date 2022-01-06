package home_work_2;

import java.util.Scanner;

public class home_work_1_1_1 {
    public static void main(String[] args) {
        Scanner concole = new Scanner(System.in);
        System.out.println("Введите число");
        int[] num = new int[concole.nextInt()];
        int value = 1;
        long maxValue = 100000;
        for (int i = 0; i < num.length; i++) {
            num[i] = value;
            value++;
        }
        long sum = 1;
        for (long item : num) {

            if (sum < maxValue) {
                sum *= item;
            } else {
                System.out.println("итог больше " + maxValue);
                break;
            }
        }
        System.out.println(sum);
    }
}

