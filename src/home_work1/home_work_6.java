package home_work1;

import java.util.Scanner;

public class home_work_6 {
    public static void main(String[] args) {
        System.out.println("введите 9 цифр своего номера");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();


        String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");

        System.out.println(number);
    }
}
