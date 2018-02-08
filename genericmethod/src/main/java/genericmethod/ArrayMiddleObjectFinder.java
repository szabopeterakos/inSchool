package genericmethod;

public class ArrayMiddleObjectFinder {

    public <T> T findMiddleObject(T... values) throws IllegalArgumentException {  // egy generikus osztálynak vagy egy generikus metódusa
        if (values == null) {
            throw new NullPointerException();
        }
        if (values.length == 0 || values.length % 2 == 0) {
            throw new IllegalArgumentException("Even number of elements");
        }


        return values[values.length / 2];


    }

}
