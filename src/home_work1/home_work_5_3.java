package home_work1;
import java.util.Scanner;
public class home_work_5_3 {
    public static void main(String[] args) {
        System.out.println("запрашиваю имя пользователя");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String a = "Вася";
        String b = "Анастасия";
        switch(str) {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;

        }

    }

}
