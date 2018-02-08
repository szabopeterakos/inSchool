package collectionshashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class StringsHandler {

    public Set<String> filterUniqueStrings(Collection<String> stringCollection) {
        Set<String> uniqueStrings = new HashSet<>();
        System.out.println(stringCollection.size());

        uniqueStrings.addAll(stringCollection);
        System.out.println(uniqueStrings.size());

        return uniqueStrings;
    }

    public Set<String> selectIdenticalStrings(Set<String> setA, Set<String> setB) {
        Set<String> uniqueStrings = new HashSet<>();

        for (String cA : setA) {
            if (setB.contains(cA)) {
                uniqueStrings.add(cA);
            }
        }

        return uniqueStrings;

    }



}
