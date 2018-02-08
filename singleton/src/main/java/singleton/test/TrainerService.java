package singleton.test;

public class TrainerService {
    // egy szinttel magasabban van mint a TrainerRepo, oda delegál annak a metódusait hivja
    // ő is singleton lesz

    private static final TrainerService INSTANCE = new TrainerService();

    private TrainerService() {

    }

    public static TrainerService getInstance() { // egységes belépési pont, hozzáférés a példányhoz.
        return INSTANCE;
    }

    public void createTrainer(String name) {
        if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("Empty cucc");
        }
        // repo példányhoz hozzáférni statikus metóduon keresztül osztálynévvel minősítve tudjuk hívni
        TrainerRepo.getInstance().save(new Trainer(name, 22));
    }

    public Trainer findByName(String name){
        if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("Empty cucc");
        }
        return TrainerRepo.getInstance().findByName(name); // delegálás
    }

}
