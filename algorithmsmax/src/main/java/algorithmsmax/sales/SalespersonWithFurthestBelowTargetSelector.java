package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespersons) {
        Salesperson personWithBT = salespersons.get(0);
        for (Salesperson currentPerson : salespersons) {
            if(currentPerson.getDifferenceFromTarget() < personWithBT.getDifferenceFromTarget()){
                personWithBT = currentPerson;
            }
        }
        return personWithBT;
    }

}
