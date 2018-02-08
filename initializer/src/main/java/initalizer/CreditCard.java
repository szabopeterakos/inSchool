package initalizer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private static final List<Rate> RATES;

    static { // inicializátor
        final Rate[] rates = {
                new Rate(Currency.HUF, 1.0),
                new Rate(Currency.EUR, 308.23),
                new Rate(Currency.SFR, 289.24),
                new Rate(Currency.GBP, 362.23),
                new Rate(Currency.USD, 289.77)
        };
        List<Rate> temp = new ArrayList<>();
        for (Rate c : rates) {
            temp.add(c);
        }
        RATES = temp;
    }

    private long balance;

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public CreditCard(long balance, Currency currency) {
        for (int i = 0; i < RATES.size() - 1; i++) {
            if (RATES.get(i).getCurrency() == currency) {
                this.balance = (long) (balance * RATES.get(i).getConversionFactor());
            }
        }
    }

    public long getBalance() {
        return balance;
    }

    public boolean payment(int money, Currency currency) {
        boolean isAllowed = false;
        long moneyInHuf = 0;

        for (int i = 0; i < RATES.size() - 1; i++) {
            if (RATES.get(i).getCurrency() == currency) {
                moneyInHuf = (long) (money * RATES.get(i).getConversionFactor());
                break;
            }
        }

        if (getBalance() > moneyInHuf) {
            isAllowed = true;
            balance = balance - moneyInHuf;
        }
        return isAllowed;
    }

    public boolean payment(int money) {
        boolean isAllowed = false;
        long moneyInHuf = 0;

        moneyInHuf = (long) (money * RATES.get(0).getConversionFactor());




        if (getBalance() > moneyInHuf) {
            isAllowed = true;
            balance = balance - moneyInHuf;
        }
        return isAllowed;
    }
}
