package work.dto1;
import work.dto1.appi.IProduct;
public class ProductOnBag {
    private final IProduct product;
    private final int count;

    public ProductOnBag(IProduct product, int count) {
        this.product = product;
        this.count = count;
    }

    public IProduct getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }
}
