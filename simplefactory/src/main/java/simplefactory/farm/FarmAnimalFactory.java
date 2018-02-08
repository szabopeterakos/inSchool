package simplefactory.farm;

public class FarmAnimalFactory implements AnimalFactory {
    @Override
    public Animal create(String animalType) {
        if (isBlank(animalType)) {
            throw new IllegalArgumentException("Animal type must not be empty!");
        }
        switch (animalType){
            case "horse":
                return new Horse();
            case "frog":
                return new Frog();
            case "cock":
                return new Cock();
                default:
                    throw new IllegalArgumentException("Unrecognizable animal type!");
        }
    }

    private boolean isBlank(String str) {
        if (str == null || str.trim().length() == 0) {
            return true;
        }
        return false;
    }
}
