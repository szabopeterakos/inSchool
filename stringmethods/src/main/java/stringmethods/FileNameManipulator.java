package stringmethods;

public class FileNameManipulator {

    public char findLastCharacter(String str){
        if(str == null || str.isEmpty()){ // ez az amivel lekezelem.
            throw new IllegalArgumentException("Empty string!");
        }
        String newString = str.trim();

        return newString.charAt(newString.length()-1);
    }

    public String findFileExtension(String fileName){ // "record.dat"
        if(fileName.indexOf(".")> fileName.length()-3){
            throw new IllegalArgumentException("Invalid file name!");
        }
        return fileName.substring(fileName.indexOf("."));
    }

    public boolean identifyFilesByExtension(String ext, String fileName){
        if(ext == null || fileName== null || ext.isEmpty() || fileName.length() <= ext.length()+1){
            throw new IllegalArgumentException("Invalid argument!");
        }
        if(fileName.endsWith(ext)){
            return true;
        }
        return false;
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName){
        if(searchedFileName.equalsIgnoreCase(actualFileName)){
            return true;
        }
        return false;
    }



    public String changeExtensionToLowerCase(String fileName){
        if(fileName == null || fileName.length()<1 || fileName.trim().length() < 1){
            throw new IllegalArgumentException("Empty string!");
        }

        return fileName.substring(0,1) + fileName.substring(1).toLowerCase();
    }

    public String replaceStringPart(String fileName, String present, String target){
        return fileName.replaceAll(present,target); // ha nem talál első paramétert nem cseréli le;
    }

    public static void main(String[] args) {
        String t1= "index";
        String t2= "\tan apple";

        System.out.println(t2);
        System.out.println(t2.trim());
        System.out.println(t1);
        System.out.println(t1.replace("dex","kakiverzum"));
    }
}
