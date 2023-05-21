package aula12.ex02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeMap;

import static utils.classes.FileFuncts.wordSplitter;

public class SortByInitial {
    public static void main(String[] args) throws IOException {
        TreeMap<Character, TreeMap<String, Integer>> database = new TreeMap<>();
        String str = Files.readString(Paths.get("src/aula12/A_cidade_e_as_serras.txt")).toLowerCase();
        String[] words = wordSplitter(str);



        for (String word : words) {
            if (!(word.length() > 2)) continue;

            char ch = word.charAt(0);
            if (!database.containsKey(ch)) {
                database.put(ch, new TreeMap<>());
            }

            if (!database.get(ch).containsKey(word)) {
                database.get(ch).put(word, 1);
            }
            else {
                database.get(ch).put(word, database.get(ch).get(word) + 1);
            }
        }
        System.out.println(parseTreeMap(database));

        FileWriter out = new FileWriter("src/aula12/ex02/out.txt");
        out.write(parseTreeMap(database));
        out.close();
    }
    public static String parseTreeMap(TreeMap<Character, TreeMap<String, Integer>> treeMap) {
        String str = "";
        Set<Character> keys = treeMap.keySet();

        for (Object key : keys) {
            str += key + ": ";
            for (Object key2 : treeMap.get(key).keySet()) {
                str += key2 + ", " + treeMap.get(key).get(key2) + "; ";
            }
            str += "\n";
        }
        return str;
    }
}
