package work.service1;
import work.dto1.Bag;
import work.dto1.Receipit;
import work.dto1.Shop;
import work.dto1.appi.IProduct;
import java.util.List;
import java.util.Scanner;
public class WorkService {
    public void run(List<IProduct> products){
        Scanner console = new Scanner(System.in);
        Shop shop = new Shop(products);

        Bag bag = shop.createBag();

        boolean exit = false;
        while (!exit){
            System.out.println("Выберите продукт:");

            int index = 0;
            for (IProduct product : shop.getProducts()) {
                System.out.println(++index + ". " + product.toString());
            }

            int answer = console.nextInt();
            exit = answer <= 0 || answer > index;

            if(!exit){
                System.out.print("Количество: ");
                int count = console.nextInt();
                bag.add(shop.get(answer - 1), count);
                System.out.println();
            }
        }

        Receipit receipit = shop.createReceipt(bag);

        System.out.println(receipit);

    }
}
