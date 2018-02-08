package inheritancemethods.bankaccount;

import java.math.BigDecimal;

public class DebitAccount {

    private String accountNumber;
    private long balance;

    public static final double COST = -3.0;
    public static final long MIN_COST = -200;

    public DebitAccount(String accountNumber, long balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public final long costOfTransaction(long amount) {
        long costOf = 0;
        BigDecimal costInLong = new BigDecimal(Double.toString(COST)).abs().divide(new BigDecimal("100"));
        costOf = costInLong.multiply(new BigDecimal(Long.toString(amount))).longValue();
        if (costOf < 200) {
            costOf = 200;
        }

        return costOf;
    } // 15027 == 450 // amount * cost ha < mincost akkor mincost : amount * cost

    public boolean transaction(long amount) { //40000 -- 1200 -- 8800
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount - costOfTransaction(amount));
            return true;
        }
        return false;
    }
//    public void balanceToZero() // az egyenleget nullázza le, túlköltés esetén


    public String getAccountNumber() {
        return accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
