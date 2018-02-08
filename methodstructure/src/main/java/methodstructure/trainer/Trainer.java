package methodstructure.trainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    String name;
    List<String> coursesList = new ArrayList<>();

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCourse(String c){
        coursesList.add(c);
        return;
    }

    public List<String> findCoursesBetween(char start, char end){
        List<String> temp = new ArrayList<>();
        for(String current : coursesList){
            if(current.charAt(0)>start && current.charAt(0)<end){
                temp.add(current);
            }
        }
        return temp;
    }
}
