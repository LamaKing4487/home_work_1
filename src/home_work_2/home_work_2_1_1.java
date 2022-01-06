package home_work_2;

import java.util.Scanner;

public class home_work_2_1_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("введи");
        int[] container = new int[console.nextInt()];
        for (int i = 0; i < container.length; i++) {
            System.out.println("введите число");
            container[i] = console.nextInt();
        }

        for (int item : container) {
            System.out.println(container[item]);

        }

    }
}





