package algorithmsmax.integers;

import java.util.List;

public class IntegerMaxCalculator {

    public int max(List<Integer> integers) {
        int max = integers.get(0);

        for (Integer c : integers) {
            if (c > max) {
                max = c;
            }
        }

        return max;
    }

}
