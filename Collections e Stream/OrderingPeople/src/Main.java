public class Main {
    public static void main(String[] args) {
        Ordering ordering = new Ordering();

        ordering.addPeople("Nome 1", 20, 1.56);
        ordering.addPeople("Nome 2", 30, 1.80);
        ordering.addPeople("Nome 3", 25, 1.70);
        ordering.addPeople("Nome 4", 17, 1.56);

        System.out.println("Ordenação por idade: " + ordering.orderByAge());
        System.out.println("Ordenação por altura: " + ordering.orderByHeight());
    }
}