package interfaces.trainer;

public class Trainer implements HasName, CanWork { // nincs többszörös öröklődés de interface feloldja kicsit :)

    private String name;

    public Trainer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void work() {

    }


}
