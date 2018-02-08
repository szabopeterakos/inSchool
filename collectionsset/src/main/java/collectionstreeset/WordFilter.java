package collectionstreeset;

import java.util.*;

public class WordFilter {

    public Set<String> filterWords(String[] randomStrings) {
        List<String> list = new ArrayList<>(randomStrings.length);
        for (String c : randomStrings) {
            list.add(c);
        }
        Set<String> treeSet = new TreeSet<>(list);
        return treeSet;
    }

    public Set<String> filterWords2(String[] randomStrings) {
        Set<String> unique = new TreeSet<>();
        for (String s : randomStrings) {
            unique.add(s);
        }
        return unique;
    }

}
