package dpintro.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements Container {

    List<Animal> animalList = new ArrayList<>();

    public Zoo(List<Animal> animals){
        this.animalList.addAll(animals);
    }

    @Override
    public Iterator getIterator() {
        ZooIterator zooIterator = new ZooIterator(animalList);
        return zooIterator;

    }
}
