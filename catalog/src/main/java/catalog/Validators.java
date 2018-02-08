package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String str) {
        if (str == null || str.trim().length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(List<String> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        for (String c : list) {
            if (isBlank(c) == true) {
                return true;
            }
        }
        return false;
    }

}
