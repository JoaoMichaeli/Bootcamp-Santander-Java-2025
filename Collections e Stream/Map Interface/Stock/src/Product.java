public class Product {

    private String name;

    private double price;

    private int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Nome: " + name +
                " - Preço: " + price +
                " - Quantidade: " + amount +
                " | ";
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
