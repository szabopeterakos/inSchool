package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespersons) {
        Salesperson personWithAT = salespersons.get(0);
        for (Salesperson currentPerson : salespersons) {
            if(currentPerson.getDifferenceFromTarget() > personWithAT.getDifferenceFromTarget()){
                personWithAT = currentPerson;
            }
        }
        return personWithAT;
    }


}
