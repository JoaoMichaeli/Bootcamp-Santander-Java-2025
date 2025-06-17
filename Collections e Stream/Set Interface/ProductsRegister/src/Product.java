import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {

    private long code;

    private String name;

    private  double price;

    private int amount;

    public Product(long code, String name, double price, int amount) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public int compareTo(Product p) {
        return name.compareToIgnoreCase(p.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(getCode(), product.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCode());
    }

    @Override
    public String toString() {
        return "Nome: " + name +
                " - Código: " + code +
                " - Preço: " + price +
                " - Quantidade: " + amount +
                " | ";
    }

    public String getName() {
        return name;
    }

    public Long getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

}

class ComparatorByPrice implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}
