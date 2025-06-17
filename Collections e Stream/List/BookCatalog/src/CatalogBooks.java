import java.util.ArrayList;
import java.util.List;

public class CatalogBooks {

    private final List<Book> bookList;

    public CatalogBooks() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int year) {
        bookList.add(new Book(title, author, year));
    }

    public List<Book> searchByAuthor(String author){
        List<Book> booksByAuthor = new ArrayList<>();

        if (!bookList.isEmpty()){
            for (Book b : bookList) {
                if (b.getAuthor().equalsIgnoreCase(author)) {
                    booksByAuthor.add(b);
                }
            }
        }
        return booksByAuthor;
    }

    public List<Book> searchByYear(int initialYear, int finalYear) {
        List<Book> booksByYear = new ArrayList<>();

        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getYear() >= initialYear && b.getYear() <= finalYear){
                    booksByYear.add(b);
                }
            }
        }
        return booksByYear;
    }

    public Book searchByTitle(String title) {
        Book bookByTitle = null;

        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getTitle().equalsIgnoreCase(title)) {
                    bookByTitle = b;
                    break;
                }
            }
        }
        return bookByTitle;
    }
}
