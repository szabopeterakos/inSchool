package solid.base;

public class AccountValidator implements Validator {

    @Override
    public boolean isValid(String userName) {
        if( userName == null || userName.length() < 6 || userName.trim().contains(" ")){
            return false;
        }
        return true;
    }

}
