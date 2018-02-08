package methodchain.trainer;

public class Trainer {

    private String name;
    private int age;

    public Trainer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

//    public Trainer setAgeT(int age) { // ez egy implicit param ezért kell a return this
//        this.age = age;
//        return this;
//    }
//
//    public Trainer setNameT(String name) {
//        this.name = name;
//        return this;
//    }
}
