package dpintro.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class ZooIterator implements Iterator {
    private int index;
    private List<Animal> animalList = new ArrayList();

    public ZooIterator(List<Animal> animalList) {
        this.animalList = animalList;
    }

    @Override
    public boolean hasNext() {
        return !(animalList.size() - 1 == index);
    }

    @Override
    public Object next() {
        if (animalList.size() > index) {
            index++;
            return animalList.get(index);
        }
        return null;
    }
}
