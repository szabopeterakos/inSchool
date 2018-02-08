package algorithmscount.bankaccounts;

import java.util.List;

public class TransactionCounter {

    public int countEntryLessThan(List<Transaction> transactions, int lessThen){
        int count = 0;

        for(Transaction current :transactions){
            if(current.getAmount() < lessThen){
                count++;
            }
        }

        return count;
    }

}
