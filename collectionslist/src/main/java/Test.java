import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,5,6,3,2,7);

        System.out.println(list);

        Set<Integer> set1 = new HashSet<>(list); // rendezve ad vissza
        Set<String> set2 = new TreeSet<>(Arrays.asList("a","b","Z","0","ł")); // szám nagybetü kisbetü egyéb
        Set<String> set3 = new HashSet<>(Arrays.asList("a","b","Z","0","ł")); // szám kisetü egyéb nagybetü
        Set<String> set4 = new HashSet<>(Arrays.asList("a","a")); // tudok belerakni többet de csak egyet fogad be

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
        System.out.println(set4.size());
    }

}
