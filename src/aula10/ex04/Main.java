package aula10.ex04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> wordsBiggerThan2 = new ArrayList<>();
        ArrayList<String> wordsEndWithS = new ArrayList<>();
        Scanner input = new Scanner(new FileReader("src/aula10/ex04/words.txt"));

        while (input.hasNext()) {
            String word = input.next();
            
            if (word.length() > 2)
                if (word.matches("[a-zA-Z]*"))
                    wordsBiggerThan2.add(word);
            
            if (word.endsWith("s")){
                wordsEndWithS.add(word);
            }
        }
        System.out.println(wordsBiggerThan2 + "\n");
        System.out.println(wordsEndWithS);

    }
}
