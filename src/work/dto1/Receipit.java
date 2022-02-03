package work.dto1;
import java.util.ArrayList;
import java.util.List;

public class Receipit {
    private final List<String> items;
    private double sum;

    public Receipit() {
        this.items = new ArrayList<>();
    }

    public void add(String item){
        this.items.add(item);
    }

    public List<String> getItems() {
        return items;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int index = 1;
        for (String item : items) {
            builder.append(index++).append(". ")
                    .append(item)
                    .append("\n")
            ;
        }
        builder.append("Итого надо заплатить: " + sum);
        return builder.toString();
    }
}
