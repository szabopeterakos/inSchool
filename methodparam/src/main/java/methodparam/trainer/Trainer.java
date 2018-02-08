package methodparam.trainer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trainer {

    String name;
    int age;
    Answer answer;
    List<Course> courseList = new ArrayList<>();

    public Trainer() {
    }


    public Trainer(String name, int age, Trainer.Answer answer) {
        this.name = name;
        this.age = age;
        this.answer = answer;
    }

    public enum Answer {
        YES,NO;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Course> getCourseList() {
        return courseList;
    }


    // http://yellowroad.training360.com:3333/java/lessons/methodparam rec: 10:00
    // FIGYELNI :
    // a paraméterként átadott objektum állapotát változtatjuk-e
    // az adott metóduson belül. ha változtatjuk akkor visszahatás lesz.
    // ha AZONBAN a változó értékét módosítom ... már máshová mutat a két névileg azonos deklaráció.

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
        //courseList.add(new Course("modositos"));
        courseList = Arrays.asList(new Course("f"),new Course("g"));
    }

    public void changeData(TrainerData td){
        this.name = td.getName();
        this.age = td.getAge();
        this.answer = td.getAnswer();
    }


}
