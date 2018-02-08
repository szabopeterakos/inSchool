package intromethods;

public class Todo {

    public String caption;
    public boolean finished;

    public Todo(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public boolean isFinished() {
        return finished;
    }

    public void finish(){
        this.finished = true;
    }

    public void MytoString(){
        System.out.println("name : " + caption);
        System.out.println("kész-e : " + caption);
    }
}
