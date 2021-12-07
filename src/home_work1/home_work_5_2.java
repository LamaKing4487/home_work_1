package home_work1;

import java.util.Scanner;

public class home_work_5_2 {
    public static void main(String[] args) {
        String a = "Вася";
        String b = "Анастасия";
        System.out.println("запрашиваю имя пользователя");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.equals(a)) {
            System.out.println("Привет!");
            System.out.println("я тебя так долго ждал");
        } else if (str.equals(b)) {
            System.out.println("я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
