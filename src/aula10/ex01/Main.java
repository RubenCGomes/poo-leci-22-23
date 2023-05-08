package aula10.ex01;

import aula10.classes.Book;
import utils.classes.ParseToStr;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, aula10.classes.Book> genres = new HashMap<>();

        // adicionar géneros
        genres.put("Drama", new aula10.classes.Book("A Little Life", "Hanya Yanagihara", 2016));
        genres.put("Romance", new aula10.classes.Book("Normal People", "Sally Rooney", 2018));
        genres.put("War", new aula10.classes.Book("Novel Without a Name", "Duong Thu Huong", 1995));
        genres.put("Crime", new aula10.classes.Book("Crime and Punishment", "Fyodor Dostoyevsky", 1866));
        genres.put("Self-Help", new Book("12 Rules for Life", "Jordan Peterson", 2018));

        System.out.println(ParseToStr.parseHashMap(genres));

        // remover um género / livro

        genres.remove("Romance");

        System.out.println(ParseToStr.parseHashMap(genres));
    }
}
