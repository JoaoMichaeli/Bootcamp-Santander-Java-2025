import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RegisterProduct {

    public Set<Product> productSet;

    public RegisterProduct() {
        this.productSet = new HashSet<>();
    }

    public void addProduct(long code, String name, double price, int amount) {
        productSet.add(new Product(code, name, price, amount));
    }

    public Set<Product> showProductsByName(){
        Set<Product> productsByName = new TreeSet<>(productSet);

        return productsByName;
    }

    public Set<Product> showProductsByPrice(){
        Set<Product> productsByPrice = new TreeSet<>(new ComparatorByPrice());

        productsByPrice.addAll(productSet);

        return productsByPrice;
    }
}

