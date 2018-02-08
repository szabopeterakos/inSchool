package stringconcat;

public class Name {

    String familyName; // kt
    String middleName;
    String givenName; // kt
    Title title;


    public Name(String familyName, String middleName, String givenName, Title title) {

        if(isEmpty(familyName) || isEmpty(givenName)){
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }

        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public boolean isEmpty(String str) {
        if (str == "" || str == null) {
            return true;
        }
        return false;
    }

    public Name(String familyName, String middleName, String givenName) {
        if(isEmpty(familyName) || isEmpty(givenName)){
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;

    }

    // "Smith", "G", "John", Title.MR
    // Mr. John G Smith

    public String concatNameWesternStyle() {
        if (isEmpty(middleName) && title == null) {
            return givenName.concat(" ").concat(familyName);
        }
        if (isEmpty(middleName) && !(title == null)) {
            return title.getSTRING().concat(" ").concat(givenName).concat(" ").concat(familyName);
        }
        if (!isEmpty(middleName) && title == null) {
            return givenName.concat(" ").concat(middleName).concat(" ").concat(familyName);
        } else
            return title.getSTRING().concat(" ").concat(givenName).concat(" ").concat(middleName).concat(" ").concat(familyName);

    }
    // Mr. Smith G John
    public String concatNameHungarianStyle() {
        if (isEmpty(middleName) && title == null) {
            return familyName.concat(" ").concat(givenName);
        }
        if (isEmpty(middleName) && !(title == null)) {
            return title.getSTRING().concat(" ").concat(familyName).concat(" ").concat(givenName);
        }
        if (!isEmpty(middleName) && title == null) {
            return familyName.concat(" ").concat(middleName).concat(" ").concat(givenName);
        } else
            return title.getSTRING().concat(" ").concat(familyName).concat(" ").concat(middleName).concat(" ").concat(givenName);

    }

//    if (isEmpty(middleName) && title == null) {
//        return givenName.concat(" ").concat(familyName);
//    }
//        if (isEmpty(middleName) && !(title == null)) {
//        return title.getPrefix().concat(" ").concat(givenName).concat(" ").concat(familyName);
//    }
//        if (!isEmpty(middleName) && title == null) {
//        return givenName.concat(" ").concat(middleName).concat(" ").concat(familyName);
//    } else
//            return title.getPrefix().concat(" ").concat(givenName).concat(" ").concat(middleName).concat(" ").concat(familyName);


}
