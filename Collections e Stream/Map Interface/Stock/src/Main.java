public class Main {

    public static void main(String[] args) {
        ProductStock stock = new ProductStock();

        stock.showProduct();

        stock.addProduct(1L, "Produto A", 10, 5.0);
        stock.addProduct(2L, "Produto B", 5, 10.0);
        stock.addProduct(3L, "Produto C", 2, 15.0);

        stock.showProduct();

        System.out.println("\nValor total do estoque: R$" + stock.totalPrice());

        System.out.println("\nProduto mais caro: " + stock.getMoreExpensiveProduct());

    }
}
