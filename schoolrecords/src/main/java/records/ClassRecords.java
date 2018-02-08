package records;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd = new Random();
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public boolean addStudent(Student student) {
        for (Student std : students) {
            if (std.getName().equals(student.getName())) { //objektum ==??
                return false;
            }
        }

        this.students.add(student);
        return true;
    }

    public String getClassName() {
        return className;
    }

    public boolean removeStudent(Student student) {
        for (Student std : students) {
            if (std.getName().equals(student.getName())) {

                this.students.remove(student);
                return true;
            }
        }
        return false;

    }

    public double calculateClassAverage() {
        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class");
        }

        double sum = 0;
        int counter = 0;
        for (Student current : students) {
            if (current.calculateAverage() == 0) { // saját átlagból
                throw new ArithmeticException("No marks present");
            }
            sum += current.calculateAverage();
            counter++;

        }

        return (double) sum / counter;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class");
        }

        double sum = 0;
        int counter = 0;

        for (Student current : students) {
            if (!(current.calculateSubjectAverage(subject) == 0)) {
                sum += current.calculateSubjectAverage(subject);
                counter++;
            }

        }

        return (double) sum / counter;
    }

    public Student findStudentByName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.size() == 0) {
            throw new IllegalStateException("No students to search!");
        }

        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }

        throw new IllegalArgumentException("Student by this name cannot be found!");
    }


    public Student repetition(){
        if (students == null || students.size() < 1) {
            throw new IllegalStateException("No students to select for repetition!");
        }

        int chooseOne = rnd.nextInt(students.size());

        return students.get(chooseOne);

    }

    public List<StudyResultByName> listStudyResults() {
        if (students == null || students.size() < 1) { // ==0
            throw new IllegalStateException("No students to list results!");
        }

        List<StudyResultByName> studyResultByNames = new ArrayList<>();

        for (Student student: students) {
            studyResultByNames.add(new StudyResultByName(student.calculateAverage(), student.getName()));
        }

        return studyResultByNames;
    }

    public String listStudentNames() {
        if (students == null || students.size() == 0) { // ==0
            throw new IllegalStateException("No students to list!");
        }
        String studentsString = "";

        for (Student student: students) {
            studentsString += student.getName() + ", ";
        }

        studentsString = studentsString.substring(0, studentsString.length() - 2);

        return studentsString;
    }


}
