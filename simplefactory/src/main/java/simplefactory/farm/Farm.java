package simplefactory.farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    AnimalFactory animalFactory;
    List<Animal> animals = new ArrayList<>();

    public Farm(AnimalFactory animalFactory){
        this.animalFactory = animalFactory;
    }
    public void newAnimalArrived(String animalType) {
        animals.add(animalFactory.create(animalType));
    }
    //üres paraméterre dobjon IllegalArgumentException kivételt

    public List<String> getAnimalVoices() {
        List<String> stringList = new ArrayList<>();
        for(Animal c: animals){
            if(!stringList.contains(c.speak())){
                stringList.add(c.speak());

            }
        }
        return stringList;
    }//összeszedi az előforduló állatok egyedi hangjait string formában

}
