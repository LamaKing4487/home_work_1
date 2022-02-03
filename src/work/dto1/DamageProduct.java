package work.dto1;
import work.dto1.appi.IProduct;
public class DamageProduct implements IProduct{
    private final String name;
    private final double price;
    private final double discount;
    private final String description;

    public DamageProduct(String name, double price, double discount, String description) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name + ", Цена – " + price + ", Скидка – " + discount + "%, Уценка – " + description;
    }
}
