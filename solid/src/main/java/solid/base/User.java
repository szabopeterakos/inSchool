package solid.base;

public class User {

    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getLoginName(){
        return getUserName();
    }

}
