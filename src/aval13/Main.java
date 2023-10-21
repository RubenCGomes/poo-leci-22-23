package aval13;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BookManager bookManager = new BookManager();

        while (true){
            System.out.println("""
                1 - add book
                2 - remove book
                3 - search by name
                4 - search by author
                5 - search by date
                6 - search by ISBN
                7 - list all books
                8 - list by name
                9 - list by author
                10 - list by release date
                11 - load file
                0 - close
                """);
            Scanner inp = new Scanner(System.in);
            int option = inp.nextInt();
            switch (option){
                case 0 -> {
                    System.out.println("Writing to file...");
                    bookManager.save("src/aval13/out.txt");
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                case 1 -> {
                    while (true){
                        System.out.println("Book name?");
                        String name = inp.nextLine();
                        if (name.length() == 0) {System.out.println("Book name must be valid!"); continue;}

                        System.out.println("Book author?");
                        String author = inp.nextLine();
                        if (author.length() == 0) {System.out.println("Book author must be valid!"); continue;}

                        System.out.println("Book publisher?");
                        String publisher = inp.nextLine();
                        if (publisher.length() == 0) {System.out.println("Book publisher must be valid!"); continue;}

                        System.out.println("Book ISBN?");
                        String isbn = inp.nextLine();
                        if (validateISBN(isbn)) {System.out.println("ISBN must be valid!"); continue;}

                        System.out.println("Book release date?");
                        LocalDate date = LocalDate.parse(inp.nextLine());

                        if (bookManager.addBook(new Book(name, author, publisher, isbn, date)))
                            System.out.println("Book added with success!");
                        else
                            System.out.println("Book already exists!");
                        break;
                    }
                }
                case 2 -> {
                    while (true){
                        System.out.println("Book name?");
                        String name = inp.nextLine();
                        if (name.length() == 0) {System.out.println("Book name must be valid!"); continue;}

                        System.out.println("Book author?");
                        String author = inp.nextLine();
                        if (author.length() == 0) {System.out.println("Book author must be valid!"); continue;}

                        System.out.println("Book publisher?");
                        String publisher = inp.nextLine();
                        if (publisher.length() == 0) {System.out.println("Book publisher must be valid!"); continue;}

                        System.out.println("Book ISBN?");
                        String isbn = inp.nextLine();
                        if (validateISBN(isbn)) {System.out.println("ISBN must be valid!"); continue;}

                        System.out.println("Book release date?");
                        LocalDate date = LocalDate.parse(inp.nextLine());

                        if (bookManager.removeBook(new Book(name, author, publisher, isbn, date))) {
                            System.out.println("Book removed with success!");
                        }
                        else {
                            System.out.println("Book doesn't exist!");
                        }
                        break;
                    }
                }
                case 3 -> {
                    while (true){
                        System.out.println("Book name?");
                        String name = inp.nextLine();

                        if (name.length() == 0) {System.out.println("Book name must be valid!"); continue;}

                        if (bookManager.searchByname(name) == null)
                            System.out.println("Book was not found!");
                        else {
                            System.out.println(bookManager.searchByname(name));
                            break;
                        }
                    }
                }
                case 4 -> {
                    while (true){
                        System.out.println("Book author?");
                        String author = inp.nextLine();

                        if (author.length() == 0) {System.out.println("Book name must be valid!"); continue;}

                        List<Book> books = bookManager.searchByAuthor(author);
                        books.forEach(System.out::println);
                        break;
                    }
                }
                case 5 -> {
                    System.out.println("Starting date? (format yyyy-mm-dd) ");
                    LocalDate initDate = LocalDate.parse(inp.nextLine());

                    System.out.println("Ending date? (format yyyy-mm-dd) ");
                    LocalDate endDate = LocalDate.parse(inp.nextLine());

                    System.out.println(bookManager.searchByDateInterval(initDate, endDate));
                }
                case 6 -> {
                    while (true){
                        System.out.println("ISBN?");
                        String isbn = inp.nextLine();

                        if (!validateISBN(isbn)) System.out.println("ISBN must be valid!");
                        else {System.out.println(bookManager.searchByISBN(isbn)); break;}
                    }
                }
                case 7 -> bookManager.listAllBooks();

                case 8 -> bookManager.listBooksByName();

                case 9 -> bookManager.listBooksByAuthor();

                case 10 -> bookManager.listBooksByDate();

                case 11 ->{
                    System.out.println("File path?");
                    String path = inp.next();

                    bookManager.load(path);
                }
                default -> System.out.println("Invalid option!");
            }

        }
    }
    public static boolean validateISBN(String isbn) {
        String[] str = isbn.split("-");
        int size = 0;

        for (String s : str) {
            size += s.length();
        }
        return size <= 10 && size > 0;
    }
}
