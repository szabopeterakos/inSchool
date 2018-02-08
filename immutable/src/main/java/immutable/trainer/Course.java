package immutable.trainer;

public class Course {

    public String getName() {
        return name;
    }

    public Course(String name) {

        this.name = name;
    }

    private final String name;

}
