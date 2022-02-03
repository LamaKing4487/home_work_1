package work.dto1;
import work.dto1.appi.IProduct;
import java.util.ArrayList;
import java.util.List;
public class Shop {
    private final List<IProduct> products;

    public Shop() {
        this.products = new ArrayList<>();
    }

    public Shop(List<IProduct> products) {
        this();
        this.products.addAll(products);
    }

    public void add(IProduct product){
        this.products.add(product);
    }

    public IProduct get(int index){
        return this.products.get(index);
    }

    public List<IProduct> getProducts() {
        return products;
    }

    public Bag createBag(){
        return new Bag();
    }

    public Receipit createReceipt(Bag bag){
        Receipit receipt = new Receipit();
        List<ProductOnBag> products = bag.getProducts();

        double finalSum = 0;
        for (ProductOnBag productOnBag : products) {
            IProduct product = productOnBag.getProduct();
            int count = productOnBag.getCount();
            double sumItem = product.getFinalPrice() * count;

            receipt.add(product.toString() + ", Количество – " + count +
                    ", Сумма – " + sumItem);

            finalSum += sumItem;
        }

        receipt.setSum(finalSum);

        return receipt;
    }
}
