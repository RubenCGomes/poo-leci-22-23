package utils.classes;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;

public class ParseToStr {
    public static String parseHashMap(HashMap genre){
        String str = "";
        Set keys = genre.keySet();

        for (Object key : keys) {
            str += "\n" + key + ":\n" + genre.get(key) + "\n";
        }
        return str;
    }

    public static String parseTreeMap(TreeMap genre){
        String str = "";
        Set keys = genre.keySet();

        for (Object key : keys) {
            str += "\n" + key + ":\n" + parseLinkedList((LinkedList) genre.get(key)) + "\n";
        }
        return str;
    }

    public static String parseLinkedList(LinkedList list){
        String str = "";

        for (Object key : list) {
            str += key + "\n";
        }
        return str;
    }
}
