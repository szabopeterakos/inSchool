package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int gretaterThen){
        int counter = 0;

        for(BankAccount currentAccount :bankAccounts){
            if(currentAccount.getBalance() > gretaterThen){
                counter++;
            }
        }
        return counter;
    }

}
