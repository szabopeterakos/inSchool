package collectionsarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (ballCount <= lotteryType) {
            throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        }

        return selector(lotteryType, ballCount);
    }

    private List<Integer> selector(int type, int ballsNumber) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < type; i++) {
            int randomNum = new Random().nextInt(type) + 1;

            while (list.contains(randomNum)) {   // ha a listában már van ez a szám akkor...
                randomNum = new Random().nextInt(type) + 1;
            }

            list.add(randomNum);
        }
        return list;
    }

}
