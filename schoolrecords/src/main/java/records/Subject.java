package records;

public class Subject {

    private String subject;


    public Subject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString(){
        return subject;
    }


}
