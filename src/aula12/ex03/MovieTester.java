package aula12.ex03;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

import static utils.classes.ParseToStr.parseLinkedList;


public class MovieTester {
    public static void main(String[] args) throws IOException {
        Cinema cinema = new Cinema();

        cinema.loadFile("src/aula12/movies.txt");

        System.out.println("Movies sorted by score:\n");
        System.out.print(cinema.listDownByScore());

        System.out.println("------------------------------------------------------------\n");

        System.out.println("Movies sorted by runtime:\n");
        System.out.print(cinema.listUpByRuntime());

        System.out.println("------------------------------------------------------------\n");

        System.out.println("Genres of movies and number of movies:\n");
        System.out.print(parseTreeMap(cinema.listByGenre()));

        System.out.println("------------------------------------------------------------\n");

        Scanner inp = new Scanner(System.in);
        String chosenGenre;

        do {
            System.out.print("Choose a genre: \n");
            chosenGenre = inp.nextLine().toLowerCase();
        }
        while (!cinema.listByGenre().containsKey(chosenGenre));

        System.out.println("Showing " + chosenGenre + " movies:\n");
        System.out.print(parseLinkedList(cinema.printGenre(chosenGenre)));

        System.out.println("------------------------------------------------------------\n");

        System.out.println("Writing to file...\n");
        cinema.writeSelection();
        System.out.println("Done!\nExiting...");
    }

    public static String parseTreeMap(TreeMap<String, Integer> map){
        StringBuilder str = new StringBuilder();
        for (Object key : map.keySet()) {
            str.append(key).append(" - ").append(map.get(key)).append("\n");
        }
        str.append("\n");
        return str.toString();
    }
}
