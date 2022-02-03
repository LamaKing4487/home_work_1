package work.main1;
import work.dto1.DamageProduct;
import work.dto1.SaleProduct;
import work.dto1.StandartProduct;
import work.dto1.appi.IProduct;
import work.service1.WorkService;
import java.util.ArrayList;
import java.util.List;
public class WorkMain {
    public static void main(String[] args) {
        WorkService service = new WorkService();
        List<IProduct> products = new ArrayList<>();
        products.add(new StandartProduct("Молоко", 2.35));
        products.add(new SaleProduct("Телевизор", 8563, 31));
        products.add(new DamageProduct("Бананы", 10, 50, "битые"));
        service.run(products);
    }

}
