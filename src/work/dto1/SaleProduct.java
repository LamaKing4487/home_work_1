package work.dto1;
import work.dto1.appi.IProduct;
public class SaleProduct implements IProduct{
    private final String name;
    private final double price;
    private final double discount;

    public SaleProduct(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double getFinalPrice() {
        return getPrice() - (getPrice() * (getDiscount() / 100));
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return name + ", Цена – " + price + ", Скидка – " + discount + "%";
    }
}
