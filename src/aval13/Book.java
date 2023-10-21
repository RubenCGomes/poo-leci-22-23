package aval13;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    public static int id = 0;
    private String name;
    private String author;
    private String publisher;
    private String isbn;
    private LocalDate releaseDate;

    public Book(String name, String author, String isbn, LocalDate releaseDate) {
        id++;
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.releaseDate = releaseDate;
    }
    public Book(String name, String author, String publisher, String isbn, LocalDate releaseDate) {
        id++;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.releaseDate = releaseDate;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Book.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher) && Objects.equals(isbn, book.isbn) && Objects.equals(releaseDate, book.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publisher, isbn, releaseDate);
    }

    @Override
    public String toString() {
        return "BOOK ID: " + this.id +
                "\n" + name + ", by " + author + ", " + publisher + "ISBN: " + isbn + ", released on " + releaseDate + "\n";
    }
}
