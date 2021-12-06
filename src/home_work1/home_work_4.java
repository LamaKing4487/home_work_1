package home_work1;
import java.util.Scanner;
public class home_work_4 {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";
        System.out.println("Я умный будильник и решаю надо тебе на работу или нет");
        System.out.println("у тебя есть выбор a - отпуск , b - рабочий день , c -  не рабочий день");
        System.out.println("снаала ответь мне, у тебя отпуск?");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.equals(a)) {
            System.out.println("спи дальше , у тебя отпуск)");
        }
         else if (str.equals(b)) {
            System.out.println("вставай , самурай!");

        }
        else if (str.equals(c)) {
            System.out.println("отдыхай, у тебя ещё есть время)");
        }
        else {
            System.out.println("честно говоря хз , что тебе делать");
        }
    }
}
