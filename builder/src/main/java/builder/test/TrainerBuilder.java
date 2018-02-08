package builder.test;

public class TrainerBuilder {

    private String name = "Hankook";
    private int age = -1;

    public TrainerBuilder withName(String name){
        this.name = name;
        return this;
    }

    public TrainerBuilder withAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("a minimum is 18, your age is : " + age + " not allowed ");
        }
        this.age = age;
        return this;
    }

    public TrainerBuilder withAge(String age){
        try {
            withAge(Integer.parseInt(age));
        } catch (NumberFormatException nfe){
            throw new IllegalArgumentException("thiws string is not a nuber:"+age);
        }
        return this;
    }

    public Trainer build(){
        if(name == "Hankook" || age == -1){
            throw new IllegalArgumentException("name or age is not ready yet");
        }
        return new Trainer(name,age);
    }


}
