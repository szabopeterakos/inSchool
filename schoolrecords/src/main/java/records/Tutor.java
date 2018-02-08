package records;

import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> subjectList;

    public Tutor(String name, List<Subject> subjectList) {
        this.name = name;
        this.subjectList = subjectList;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject searchSubject) {
        for (Subject current : subjectList) {
            if(current.getSubject() == searchSubject.getSubject()){
                return true;
            }
        }
        return false;
    }
}
