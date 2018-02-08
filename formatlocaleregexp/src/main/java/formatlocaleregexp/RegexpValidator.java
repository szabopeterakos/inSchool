package formatlocaleregexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpValidator {

    public boolean validateEmail(String email) {
        if(!isEmpty(email)){
            throw new IllegalArgumentException("Empty string");
        }
        boolean temp = email.matches("^[A-Z a-z 0-9].+@[a-z]+.+$");
        return temp;
    }

    public boolean validateAcademicYear(String academicYear) {

        Pattern p = Pattern.compile("[0-9][0][0-9][0-9]-[0-9][0][0-9][0-9]");
        Matcher m = p.matcher(academicYear);
        boolean temp = m.matches();
        return temp;
    }

    public boolean validateYearString(String yearString) {
        if(!isEmpty(yearString)){
            throw new IllegalArgumentException("Empty string passed!");
        }
        if(Integer.parseInt(yearString) < 1970){
            return false;
        }
        return yearString.matches("[12][0-9][0-9][0-9]$");
    }

    private boolean isEmpty(String str) {
        if (str == null || str.trim().length() == 0) {
           return false;
        }
        return true;
    }
}
