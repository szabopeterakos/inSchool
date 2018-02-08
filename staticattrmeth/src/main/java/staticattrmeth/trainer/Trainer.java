package staticattrmeth.trainer;

public class Trainer {

    public static int numberOfTrainers; // egy darab van belőle viszont az összes példány hozzáfér
// statikus és példányhoz tartozó metódusok is hozzáférnek.


    private String name;

    public String getName() {
        return name;
    }

    public static int getNumberOfTrainers() {
        return numberOfTrainers;
    }

    public Trainer(String name) {
        this.name = name;
        numberOfTrainers++;
    }
}
