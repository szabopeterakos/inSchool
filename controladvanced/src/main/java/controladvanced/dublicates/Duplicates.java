package controladvanced.dublicates;

import java.util.ArrayList;
import java.util.List;

public class Duplicates { // fontos

    public List<Integer> find(List<Integer> integerList) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (integerList.get(i).equals(integerList.get(j))) {
                    duplicates.add(integerList.get(i));
                    break;
                }
            }
        }
        return duplicates;
    }


}
