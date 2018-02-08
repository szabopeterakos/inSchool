package bigdecimal;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class BigDecimalMain02 {

    public static void main(String[] args) {
        BigDecimal zz = new BigDecimal("2.33");
        System.out.println((zz.setScale(2, BigDecimal.ROUND_HALF_UP)).multiply(new BigDecimal(Double.toString(0.27))));


        BigDecimalClass tempBD = new BigDecimalClass();
        System.out.println(tempBD.calculatePriceWithTax(new BigDecimal("123")));
        System.out.println(tempBD.calculateTax(new BigDecimal("123")));
        System.out.println(tempBD.distributeBetweenDays(new BigDecimal("1.032"), 12));

//        int osszeg = 100;
//        double rate = 0.1;
//        int years  = 1;
//        for(int i = 0; i < years; i++){
//            osszeg += osszeg * rate;
//
//        }
//
//        System.out.println(osszeg);

        System.out.println(tempBD.interestOnInterest(new BigDecimal("100"), new BigDecimal("0.1"), 2));

        System.out.println(new BigDecimal("1.1234").setScale(2, BigDecimal.ROUND_HALF_UP));

        System.out.println("\n\n");
        List<BigDecimal> testerBigDecimals = Arrays.asList(new BigDecimal("1.45322"), new BigDecimal("1.4223333"), new BigDecimal("3.4432"));

        List<BigDecimal> savedTESTED = tempBD.roundHalfUpAndAddToLast(testerBigDecimals, 2);

        for (BigDecimal item : savedTESTED) {
            System.out.println(item);
        }

    }

}
