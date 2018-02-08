package collectionmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        Map<Integer, String> stringMap = new HashMap<>();

        int c = 1;
        while (c != 11) {
            stringMap.put(c, "TT" + (c * 31) + ((c % 2 == 0) ? "A" : "B"));

            c++;
        }


        System.out.println(stringMap);
        System.out.println(stringMap.isEmpty());
        System.out.println(stringMap.get(7));
        System.out.println(stringMap.put(7,"KK"));
        System.out.println(stringMap.get(7));

        System.out.println(stringMap.containsKey(11));
        System.out.println(new TreeSet<>(stringMap.keySet()));
        System.out.println(new ArrayList<>(stringMap.values()));

    }

}
