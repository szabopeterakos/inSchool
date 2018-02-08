package transactions;

import java.util.List;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> list){
        int creditSum=0;

        for(Transaction currentTrans :list){
            if(currentTrans.isCredit()){
                creditSum += currentTrans.getAmount();
            }
        }

        return creditSum;
    }

}
