package records;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Mark> marks = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Student(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }


        marks.add(mark);
    }

    public double calculateAverage() {
        if(marks.size() == 0){
            return 0.0;
        }
        double average = 0;
        for (Mark current : marks) {
            average += current.getMarkType().getMarkAsNumber();
        }
        //double res = average / marksList.size();
        Double res = new BigDecimal(average).divide(new BigDecimal(marks.size()),2,BigDecimal.ROUND_HALF_UP).doubleValue();
        return  res;
    }

    public double calculateSubjectAverage(Subject subject){

        double average = 0;
        int counter = 0;

        for (Mark mark : marks) {
            if (mark == null) {    // dupla ellenőrzés nem kell.
                throw new IllegalArgumentException("Mark must not be null!");
            } else {
                if (mark.getSubject().getSubject().equals(subject.getSubject())) {
                    average += mark.getMarkType().getMarkAsNumber();
                    counter++;
                }
            }
        }


        if(counter == 0){
            return 0.0;
        }
        //double res = average / marksList.size();
        Double res = new BigDecimal(average).divide(new BigDecimal(counter),1,BigDecimal.ROUND_HALF_UP).doubleValue();
        return  res;
    }

    @Override
    public String toString() {
        String marksString = "";

        for (Mark mark: marks) {
            marksString += mark.getSubject() + ": " + mark.toString() + ", ";
        }

        marksString = marksString.trim();
        marksString = marksString.substring(0, marksString.length() - 1);

        return this.getName() + " marks: " + marksString;
    }

//    public static void main(String... args) {
//        System.out.println("tomi");
//    }

}
