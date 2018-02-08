package stringbuilder;

public class PalindromeValidator {

    public boolean isPalindrome(String str){
        if(str == null || str.trim().length() < 1){
           throw new  IllegalArgumentException("Text must not be null!");
        }

        StringBuilder strb = new StringBuilder(str.toUpperCase());
        boolean isTrue = false;

        if(strb.equals(strb.reverse())){
            isTrue = true;
        }

        return isTrue;
    }


}
