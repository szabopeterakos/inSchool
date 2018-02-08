package collectionslinkedlist;

import java.util.*;

public class Draw {

    public Set<Integer> drawNumbers(int drawCount, int maxNumber) throws IllegalArgumentException {
        if (drawCount >= maxNumber) {
            throw new IllegalArgumentException("drawCount must be less");
        }

        Queue<Integer> queue = new PriorityQueue<>(selector(drawCount, maxNumber));

        Set<Integer> numbers = new TreeSet<>(queue); // nincs index, nem lehet duplikáció.

        return numbers;
    }

    private Set<Integer> selector(int type, int ballsNumber) {
        Set<java.lang.Integer> list = new TreeSet<>();
        for (int i = 0; i < type; i++) {

            while (!(list.size() == type)) {   // ha a listában már van ez a szám akkor...
                int randomNum = new Random().nextInt(type) + 1;
                list.add(randomNum);
            }
        }
        return list;
    }


}
