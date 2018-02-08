package bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalMain {

    public static void main(String[] args) {
        System.out.println(new BigDecimal("0.1").multiply(new BigDecimal("3")));
        System.out.println(new BigDecimal(0.1).multiply(new BigDecimal("3"))); // ha nem stringként érkezik az érték pontatlan.
        System.out.println((new BigDecimal("0.1").multiply(new BigDecimal("3")).setScale(2, BigDecimal.ROUND_HALF_UP)));

        BigDecimal zz = new BigDecimal("0.12").divide(new BigDecimal("1.3"),4,BigDecimal.ROUND_HALF_UP);
        System.out.println(zz);

        System.out.println(new BigDecimal(BigInteger.ONE));
        System.out.println(BigInteger.ZERO);
        System.out.println(BigInteger.TEN);
        System.out.println(BigDecimal.ROUND_FLOOR);

    }

}
