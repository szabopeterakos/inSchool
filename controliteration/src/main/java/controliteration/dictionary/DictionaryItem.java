package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class DictionaryItem {

    String word;
    List<String> wordslist = new ArrayList<>();

    public DictionaryItem(String word, List<String> wordslist) {
        this.word = word;
        this.addTranslations(wordslist); // fontos
    }

    void addTranslations(List<String> newTranslations){
        for(String x : newTranslations){
            if(!(wordslist.contains(x))){
                wordslist.add(x);
            }
        }
    }

    public String getWord() {
        return word;
    }

    public List<String> getWordslist() {
        return wordslist;
    }
}
