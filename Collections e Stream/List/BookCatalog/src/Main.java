public class Main {
    public static void main(String[] args) {
        CatalogBooks catalogBooks = new CatalogBooks();

        catalogBooks.addBook("Livro 1", "Autor 1", 2020);
        catalogBooks.addBook("Livro 1", "Autor 2", 2021);
        catalogBooks.addBook("Livro 2", "Autor 2", 2022);
        catalogBooks.addBook("Livro 3", "Autor 3", 2023);
        catalogBooks.addBook("Livro 4", "Autor 4", 1994);

        System.out.println(catalogBooks.searchByAuthor("Autor 2"));

        System.out.println(catalogBooks.searchByYear(2020, 2022));

        System.out.println(catalogBooks.searchByTitle("Livro 1"));
    }
}