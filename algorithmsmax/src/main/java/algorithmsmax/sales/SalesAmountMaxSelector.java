package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespersons) {
        Salesperson personWithMax = salespersons.get(0);
        for (Salesperson currentPerson : salespersons) {
            if(currentPerson.getAmount() > personWithMax.getAmount()){
                personWithMax = currentPerson;
            }
        }
        return personWithMax;
    }



}
