package introexception.patient;

public class Patient {

    String name;
    String socialSecurityNumber;
    int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (yearOfBirth < 1900) {
            throw new IllegalArgumentException("Invalid year of birth: " + yearOfBirth);
        }
        if (!new SsnValidator().isValidSsn(socialSecurityNumber)) {
            throw new IllegalArgumentException("Invalid Social Security Number: " + socialSecurityNumber);
        }


        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;


    }



//    public static void main(String[] args) {
//        Patient p = new Patient("tom","123456788",2000);
//        System.out.println(p.numbervalidator("123456788"));
//
//
//        String x = "1000008";
//        System.out.println(Integer.parseInt(x.substring(x.length()-1)));
//    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
