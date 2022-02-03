package work.dto1;
import work.dto1.appi.IProduct;
import java.util.ArrayList;
import java.util.List;
public class Bag {
    private final List<ProductOnBag> products;

    public Bag() {
        this.products = new ArrayList<>();
    }

    public void add(IProduct product, int count){
        add(new ProductOnBag(product, count));
    }

    public void add(ProductOnBag productOnBag){
        this.products.add(productOnBag);
    }

    public List<ProductOnBag> getProducts() {
        return products;
    }
}
