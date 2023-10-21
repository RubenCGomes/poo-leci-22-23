package aval13;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookManager implements BookManagerInterface{
    List<Book> books = new ArrayList<>();
    @Override
    public void load(String filePath) throws IOException {
        String [] lines = Files.readString(Paths.get(filePath)).split("\n");
        for (String line : lines) {
            String[] par = line.split("\t");
            books.add(new Book(par[0], par[1], par[2], LocalDate.parse(par[3])));
        }
    }

    @Override
    public void save(String filePath) throws IOException {
        try (FileWriter file = new FileWriter(filePath)){
            for (Book book : books){
                file.write(book.toString());
            }
        }
    }

    @Override
    public boolean validateISBN(String isbn) {
        String[] str = isbn.split("-");
        int size = 0;

        for (String s : str) {
            size += s.length();
        }
        return size <= 10 && size > 0;
    }

    @Override
    public boolean addBook(Book book) {
        if (books.contains(book))
            return false;
        else{
            books.add(book);
            return true;
        }
    }

    @Override
    public boolean removeBook(Book book) {
        if (books.contains(book)){
            books.remove(book);
            return true;
        }
        else
            return false;
    }

    @Override
    public Book searchByname(String name) {
        for (Book book : books) {
            if (book.getName().equals(name))
                return book;
        }
        return null;
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        List<Book> authors = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author))
                authors.add(book);
        }
        return authors;
    }

    @Override
    public List<Book> searchByDateInterval(LocalDate fromDate, LocalDate toDate) {
        List<Book> booksByDate = new ArrayList<>();
        for (Book book : books) {
            if (book.getReleaseDate().isBefore(toDate) && book.getReleaseDate().isAfter(fromDate))
                booksByDate.add(book);
        }
        return booksByDate;
    }

    @Override
    public Book searchByISBN(String isbn) {
        for (Book book: books) {
            if (book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    @Override
    public void listAllBooks() {
        books.forEach(System.out::println);
    }

    @Override
    public void listBooksByName() {
        books.sort((s1, s2) -> s2.getName().compareTo(s1.getName()));
        System.out.println(books.toString());
    }

    @Override
    public void listBooksByAuthor() {
        books.sort((s1, s2) -> s2.getAuthor().compareTo(s1.getAuthor()));
        System.out.println(books.toString());
    }

    @Override
    public void listBooksByDate() {
        books.sort(Comparator.comparing(Book::getReleaseDate));
        System.out.println(books.toString());
    }
}
