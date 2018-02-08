package sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int sumSalesAmount(List<Salesperson> sp){
        int sum = 0;

        for(Salesperson currentPerson : sp){
            sum += currentPerson.getAmount();
        }

        return sum;
    }

}
