package aula12.ex01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static utils.classes.FileFuncts.wordSplitter;

public class WordDiffAndCounter {
    public static void main(String[] args) throws IOException {
        String textFile = Files.readString(Paths.get("src/aula12/text.txt"));

        String[] words = wordSplitter(textFile);
        System.out.println("Número total de palavras: " + words.length);

        Set<String> diff = new HashSet<>(Arrays.stream(words).toList());
        System.out.println("Número de Diferentes Palavras: " + (diff.size()));
    }
}
