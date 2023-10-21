package aval13;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public interface BookManagerInterface {
    void load(String filePath) throws IOException;

    void save(String filePath) throws IOException;

    boolean validateISBN(String isbn);

    boolean addBook(Book book);

    boolean removeBook(Book book);

    Book searchByname(String name);

    List<Book> searchByAuthor(String author);

    List<Book> searchByDateInterval(LocalDate fromDate, LocalDate toDate);

    Book searchByISBN(String isbn);

    void listAllBooks();

    void listBooksByName();

    void listBooksByAuthor();

    void listBooksByDate();
}
