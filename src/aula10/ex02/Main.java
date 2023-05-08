package aula10.ex02;

import aula10.classes.Book;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import utils.classes.ParseToStr;

public class Main {
    public static void main(String[] args) {
        LinkedList<Book> books = new LinkedList<>();
        TreeMap<String, LinkedList> genres = new TreeMap<>();

        // criar géneros
        genres.put("Drama", new LinkedList<Book>());
        genres.put("Romance", new LinkedList<Book>());
        genres.put("War", new LinkedList<Book>());
        genres.put("Crime", new LinkedList<Book>());
        genres.put("Self-Help", new LinkedList<Book>());

        System.out.println(ParseToStr.parseTreeMap(genres));
        System.out.println("---------------------------------------------------");



        // adicionar livros aos géneros
        genres.get("Drama").add(new Book("A Little Life", "Hanya Yanagihara", 2016));
        genres.get("Romance").add(new Book("Normal People", "Sally Rooney", 2018));
        genres.get("War").add(new Book("Novel Without a Name", "Duong Thu Huong", 1995));
        genres.get("Crime").add(new Book("Crime and Punishment", "Fyodor Dostoyevsky", 1866));
        genres.get("Self-Help").add(new Book("12 Rules for Life", "Jordan Peterson", 2018));

        System.out.println(ParseToStr.parseTreeMap(genres));
        System.out.println("---------------------------------------------------");

        // adicionar mais livros aos géneros
        genres.get("Drama").add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        genres.get("Romance").add(new Book("Pride and Prejudice", "Jane Austen", 1813));



        System.out.println(ParseToStr.parseTreeMap(genres));
        System.out.println("---------------------------------------------------");

        // remover um género / livro
        genres.get("Romance").remove(1);

        System.out.println(ParseToStr.parseTreeMap(genres));

        // selecionar género aleatório
        Scanner inp = new Scanner(System.in);
        while (true){
            System.out.println("Género? ");
            String chosenGenre = inp.next();
            for (Object key : genres.keySet()) {
                if (key.equals(chosenGenre)) {
                    Random r = new Random();
                    System.out.println(genres.get(chosenGenre).get(r.nextInt(genres.get(chosenGenre).size())));
                    break;
                }
            }
        }


    }
}
