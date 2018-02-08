package stringbuilder;

public class NameBuilder {



    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title){
        //Mr. John G Smith"
        if(givenName == null || givenName.trim().isEmpty() || familyName == null || familyName.trim().isEmpty()){
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }

        String str01 = (title == null)?"":title.getValue()+" ";
        String str02 = (middleName == null || middleName.trim().length() < 1)?"":middleName+" ";

        StringBuilder message = new StringBuilder(str01);

        return message.append(givenName).append(" ").append(str02).append(familyName).toString();
    }

    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title){
        if(givenName == null || givenName.trim().isEmpty() || familyName == null || familyName.trim().isEmpty()){
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        // "Mr. Smith John"
        String str01 = (title == null)?"":title.getValue()+" ";
        String str02 = (middleName == null || middleName.trim().length() < 1)?"":middleName+" ";

        StringBuilder message = new StringBuilder(str01);

        return message.append(familyName).append(" ").append(str02).append(givenName).toString();
    }
    public String insertTitle(String name, Title title, String where){
        // Dr. John G Smith >>>> "Dr. Prof. John G Smith";
        StringBuilder sbName = new StringBuilder(name);

        return sbName.insert(sbName.indexOf(where)+1,title.getValue()+" ").toString();

    }
    public String deleteNamePart(String name, String delete){
        StringBuilder temp = new StringBuilder(name);
        return temp.delete(temp.indexOf(delete),temp.indexOf(delete)+delete.length()).toString();
    }

//    public static void main(String[] args) {
//        StringBuilder x = "1234";
//        System.out.println();
//    }
}
