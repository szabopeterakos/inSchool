package introexception.patient;

public class SsnValidator {

    public boolean isValidSsn(String socialSecurityNumber){ // 123456788
        int sum = 0;
        for(int i = socialSecurityNumber.toCharArray().length-2; i > -1; i--){
            if((i+1)% 2 == 0){
                sum += 7 * socialSecurityNumber.toCharArray()[i];
            }else if(! ((i+1) % 2 == 0)){
                sum += 3 * socialSecurityNumber.toCharArray()[i];
            }
        }

        if (socialSecurityNumber.length() != 9){ return false;};

        return (sum % 10 == Integer.parseInt(socialSecurityNumber.substring(socialSecurityNumber.length()-1)))?true:false;

    }

}
