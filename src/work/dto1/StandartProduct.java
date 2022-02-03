package work.dto1;
import work.dto1.appi.IProduct;
public class StandartProduct implements  IProduct{
    private final String name;
    private final double price;

    public StandartProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double getFinalPrice() {
        return getPrice();
    }

    @Override
    public String toString() {
        return name + ", Цена – " + price;
    }
}
