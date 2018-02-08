package bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class BigDecimalClass {

    private final double AFA = 0.27;

    final int DEFAULT_SCALE = 2;

    BigDecimal calculateTax(BigDecimal price) {

        return ((price.setScale(DEFAULT_SCALE, BigDecimal.ROUND_HALF_UP)).multiply(new BigDecimal(Double.toString(AFA)))).setScale(DEFAULT_SCALE, BigDecimal.ROUND_HALF_UP);

    }

    BigDecimal calculatePriceWithTax(BigDecimal price) {
        return calculateTax(price).add(price);
    }

    BigDecimal distributeBetweenDays(BigDecimal price, int numberOfDays) {
        return (price.divide(new BigDecimal(Integer.toString(numberOfDays))).setScale(DEFAULT_SCALE, BigDecimal.ROUND_CEILING));
    }

    BigDecimal interestOnInterest(BigDecimal principle, BigDecimal rate, int years) { // összeg kamat év , évenkénti tőkésítés
        BigDecimal sum = principle;

        for (int i = 0; i < years; i++) {
            sum = sum.add(sum.multiply(rate));
        }

        return sum;
    }

    ;

    List<BigDecimal> roundHalfUpAndAddToLast(List<BigDecimal> numbers, int scale) {
        List<BigDecimal> newListWithDecimals = new ArrayList<BigDecimal>();
        BigDecimal kulombseg = new BigDecimal("0");

        for (BigDecimal num : numbers) {
            newListWithDecimals.add(num);
            BigDecimal scaledNum = num.setScale(scale, BigDecimal.ROUND_HALF_UP);
            if(num.compareTo(scaledNum) >= 0){
                kulombseg = kulombseg.add(num.subtract(scaledNum));
            } else if(num.compareTo(scaledNum) < 0){
                kulombseg = kulombseg.add(scaledNum.subtract(num));
            }
        }

        newListWithDecimals.add(kulombseg);
        return newListWithDecimals;
    }

}
