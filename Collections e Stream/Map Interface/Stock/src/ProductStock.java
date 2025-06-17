import java.util.HashMap;
import java.util.Map;

public class ProductStock {

    private Map<Long, Product> productsStockMap;

    public ProductStock() {
        this.productsStockMap = new HashMap<>();
    }

    public void addProduct(long cod, String name, int amount, double price) {
        productsStockMap.put(cod, new Product(name, price, amount));
    }

    public void showProduct() {
        System.out.println(productsStockMap);
    }

    public double totalPrice() {
        double priceTotal = 0d;

        if (!productsStockMap.isEmpty()){
            for (Product p : productsStockMap.values()) {
                priceTotal += (p.getAmount() * p.getPrice());
            }
        }

        return priceTotal;
    }

    public Product getMoreExpensiveProduct() {
        Product productMoreExpensive = null;

        double highestPrice = Double.MIN_VALUE;
        if (!productsStockMap.isEmpty()) {
            for (Product p : productsStockMap.values()) {
                if (p.getPrice() > highestPrice) {
                    productMoreExpensive = p;
                }
            }
        }

        return productMoreExpensive;
    }
}
