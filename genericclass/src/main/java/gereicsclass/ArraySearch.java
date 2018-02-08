package gereicsclass;

public class ArraySearch {

    public DataPair<String> getFirstAndLastWord(String[] words){
        if( words == null ){
            throw new NullPointerException();
        }
        if( words.length == 0){
            throw new IllegalArgumentException();
        }
        return new DataPair<>(words);
    }

}
