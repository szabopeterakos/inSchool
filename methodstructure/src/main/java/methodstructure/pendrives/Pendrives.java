package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive best(List<Pendrive> plist){
        Pendrive pBest = plist.get(0);
        for(Pendrive currect :plist){
            if(((double)currect.getPrice() / currect.getCapacity()) < ((double)pBest.getPrice() / pBest.getCapacity())){
                pBest = currect;
            }
        }

        return pBest;
    }

    public Pendrive cheapest(List<Pendrive> plist){
        Pendrive pCheapest = plist.get(0);
        for(Pendrive currect :plist){
            if(currect.getPrice() < pCheapest.getPrice()){
                pCheapest = currect;
            }
        }
        return pCheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> plist ,int percent ,int capacity){
        for(Pendrive currect :plist){
            if(currect.getCapacity() == capacity){
                currect.setPrice(currect.getPrice() + (currect.getPrice() / percent));
            }
        }
    }

}
