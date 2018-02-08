package javabeans;

public class Trainer {

    String name;
    boolean Active;

    public Trainer(String name, boolean active) {
        this.name = name;
        Active = active;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(boolean active) {
        Active = active;
    }

    public String getName() {

        return name;
    }

    public boolean isActive() {
        return Active;
    }
}
