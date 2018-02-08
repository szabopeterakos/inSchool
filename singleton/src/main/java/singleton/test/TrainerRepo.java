package singleton.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// az e felett lévő réteg fogadja az adatokat majd, ellenőrzi hogy nem e üres,

public class TrainerRepo { // tárol, keres névszerint,
    // a repozitorit tövven használhatják de ugyan azt a példányt kell látniuk ezért lesz singleton

    private static final TrainerRepo INSTANCE = new TrainerRepo(); //

    // sinkronizált lista, nem okoz problémát ha több szálon használjuk,
    private List<Trainer> trainers = (List<Trainer>) Collections.synchronizedList(new ArrayList<Trainer>());

    private TrainerRepo() { // a konstruktor privát

    }

    public void save(Trainer trainer) {
        trainers.add(trainer);
    }

    public Trainer findByName(String name) {
        for (Trainer trainer : trainers) {
            if (trainer.getName().contains(name)) {
                return trainer;
            }
        }
        throw new IllegalArgumentException("Trainer not found on list: " + name);
    }

    public static TrainerRepo getInstance(){ // visszaagja az INSTANCE példányt.
        return INSTANCE;
    }

    public void clear(){
        trainers.clear();
    }
}
