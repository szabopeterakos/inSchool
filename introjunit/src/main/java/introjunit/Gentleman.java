package introjunit;

public class Gentleman {

    public String sayHello(String name){
        String cName = name;
        if(name == null){
            cName = "Anonimus";
        }

        return "Hello " + cName + " !";
    }

}
