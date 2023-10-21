package utils.classes;

import java.util.*;

public class FileFuncts {
    public static String[] wordSplitter(String str){
        List<String> list = new ArrayList<>(Arrays.stream(str.replaceAll("[^a-zA-ZÀ-ÖØ-öø-ÿ]", " ").split("[ \n\t.,:'‘’;?!*{}_=+&/()\\[\\]”“\"-]")).toList());
        while (list.contains("")){
            list.remove("");
        }
        return list.toArray(new String[0]);
    }
}
