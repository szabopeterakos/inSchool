package solid.base;

import java.util.ArrayList;
import java.util.List;

public class UserController {

    private List<Validator> validatorList; // függőségek, attribútumok
    private UserService userService;

    public UserController(UserService userService,List<Validator> validatorList) {
        if (userService == null || validatorList == null) {
            throw new IllegalArgumentException("not valid");
        }

        this.validatorList = validatorList;
        this.userService = userService;
    }

    public void createUser(String username) {
        if(validUserName(username)){
            userService.save(new User(username));
        }

    }

    private boolean validUserName(String userName) {
        if (validatorList.isEmpty()) {
            return true;
        }

        for (Validator c : validatorList) {
            if(c.isValid(userName)== false){
                return false;
            }
        }

        return true;

    }

}
