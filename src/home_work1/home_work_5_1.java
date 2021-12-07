package home_work1;
import java.util.Objects;
import java.util.Scanner;
public class home_work_5_1 {
    public static void main(String[] args) {
        System.out.println("запрашиваю имя пользователя");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String a = "Вася";
        String b = "Анастасия";

        if(Objects.equals(str, a)){
            System.out.println("Привет!");
            System.out.println("я тебя так долго ждал");
        }
        else {
            if(Objects.equals(str, b)) {
                System.out.println("я тебя так долго ждал");
            }
            else {
                System.out.println("Добрый день, а вы кто?");
            }
        }
    }
}
