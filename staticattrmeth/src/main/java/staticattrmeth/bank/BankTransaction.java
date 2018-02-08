package staticattrmeth.bank;

import java.math.BigDecimal;

public class BankTransaction {

    private long trxValue;

    public static final long MAX = 10_000_000;
    public static final long MIN = 1;

    private static int counter;
    public static long currentMaxValue;
    public static long currentMinValue;
    public static BigDecimal SumOfTrxs = new BigDecimal("0");

    public BankTransaction(long trxValue) {
        if (trxValue < MIN || trxValue > MAX) {
            throw new IllegalArgumentException("Transaction value should be between 0 and 10 000 000");
        }

        SumOfTrxs = SumOfTrxs.add(new BigDecimal(Long.toString(trxValue)));
        counter++;
        this.trxValue = trxValue;
//        currentMinValue = (currentMinValue > trxValue) ? trxValue : currentMinValue;
//        currentMaxValue = (currentMaxValue < trxValue) ? trxValue : currentMaxValue;

        if (counter == 0 || counter == 1 || currentMinValue > trxValue) {
            currentMinValue = trxValue;
        }
        if (counter == 0 || counter == 1 || currentMaxValue < trxValue) {
            currentMaxValue = trxValue;
        }


    }

    public static void initTheDay() {
        currentMaxValue = 0;
        currentMinValue = 0;
        counter = 0;
        SumOfTrxs = new BigDecimal("0");
    }

    public static BigDecimal averageOfTransaction() {
        return getSumOfTrxs().divide(new BigDecimal(getCounter()));
    }

    public static int getCounter() {
        return counter;
    }

    public static long getCurrentMinValue() {
        return currentMinValue;
    }

    public static long getCurrentMaxValue() {
        return currentMaxValue;
    }

    public static BigDecimal getSumOfTrxs() {
        return SumOfTrxs;
    }

}
