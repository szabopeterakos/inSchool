package controliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {  // fontos

    List<DictionaryItem> dictionaryItems = new ArrayList<>();

    public void addItem(String word, List<String> translations){
        if(dictionaryItems.size() == 0){
            dictionaryItems.add(new DictionaryItem(word, translations));
        }else{
            for (DictionaryItem item: dictionaryItems) {
                if (word != item.getWord()) {
                    dictionaryItems.add(new DictionaryItem(word, translations));
                } else {
                    item.addTranslations(translations);
                }
            }
        }
    }


    public List<String> findTranslations(String word){
        List<String> temp = new ArrayList<>();
        for (DictionaryItem item: dictionaryItems) {
            if(word == item.getWord()){
                temp = item.getWordslist();
            }
        }
        return temp;
    }


}
