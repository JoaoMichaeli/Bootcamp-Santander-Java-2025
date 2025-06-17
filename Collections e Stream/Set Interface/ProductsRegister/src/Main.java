public class Main {

    public static void main(String[] args) {
        RegisterProduct registerProduct = new RegisterProduct();

        registerProduct.addProduct(1L, "Produto 1", 15d, 5);
        registerProduct.addProduct(2L, "Produto 2", 20d, 10);
        registerProduct.addProduct(4L, "Produto 0", 10d, 2);
        registerProduct.addProduct(3L, "Produto 12", 2d, 2);
        registerProduct.addProduct(5L, "Produto 4", 2d, 25);

        System.out.println(registerProduct.productSet);

        System.out.println(registerProduct.showProductsByName());

        System.out.println(registerProduct.showProductsByPrice());
    }
}
