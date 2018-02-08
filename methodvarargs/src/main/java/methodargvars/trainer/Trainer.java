package methodargvars.trainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;
    private List<Course> courseList = new ArrayList<>();

    public Trainer(String name) {
        this.name = name;
    }

    public void addCourse(String name) {
        courseList.add(new Course(name));
    }

    // varargs - Arrays.asList() is
    public void addCourses(String... curses) { // innentől a curses valójában egy tömb
        for (String current : curses) {
            courseList.add(new Course(current));
        }
    }

    public void addCourses02(String curseFirst, String... curses) { // kényszerített egy param
        for (String current : curses) {
            courseList.add(new Course(current));
        }
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courseList;
    }
}
