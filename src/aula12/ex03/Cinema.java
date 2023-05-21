package aula12.ex03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Cinema {
    List<Movie> movies = new ArrayList<>();

    public void loadFile(String path) throws FileNotFoundException {
        Scanner input = new Scanner(new File(path));
        // ditch first line
        input.nextLine();

        while (input.hasNext()){
            String[] line = input.nextLine().split("\t");
            movies.add(new Movie(line[0], Double.parseDouble(line[1]), line[2], line[3], Integer.parseInt(line[4])));
        }
    }

    public String  listDownByScore(){
        movies.sort(Comparator.comparingDouble(Movie::getScore));
        return this.toString();
    }

    public String listUpByRuntime(){
        movies.sort((s1, s2) -> Integer.compare(s2.getRuntime(), s1.getRuntime()));
        return this.toString();
    }

    public TreeMap<String, Integer> listByGenre(){
        TreeMap<String, Integer> genres = new TreeMap<>();
        movies.forEach(movie -> genres.put(movie.getGenre(),
                genres.containsKey(movie.getGenre()) ? genres.get(movie.getGenre()) + 1 : 1));
        return genres;
    }

    public LinkedList<Movie> printGenre(String chosenGenre){
        LinkedList<Movie> list = new LinkedList<>();
        movies.forEach(movie -> {if (chosenGenre.equals(movie.getGenre())) list.add(movie);});
        return list;
    }

    public void writeSelection() throws IOException {
        try (FileWriter file = new FileWriter("src/aula12/ex03/myselection.txt")){
            movies.forEach(movie -> {if (movie.getScore() > 60) {
                try {
                    file.write(movie.toString());
                } catch (IOException e) {System.out.println("Failed to write to file");}
            }
            });
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Object key : movies) {
            str.append(key).append("\n");
        }
        return str.toString();
    }
}
