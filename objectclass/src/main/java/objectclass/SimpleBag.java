package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {

    private List<Object> items = new ArrayList<>();

    public SimpleBag(){
    }

    public void putItem(Object item){
        if(item != null){
            items.add(item);
        }
    }

    public boolean isEmpty(){
        if(getItems().size() == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return getItems().size();
    }

//    public void beforeFirst(){}
//    public boolean hasNext()
//    public Object next()
    public boolean contains(Object item){
        if(!isEmpty()){
            for(Object c :items){
                if(c.equals(item)){
                    return true;
                }
            }
        }
        return false;
    }
//    public int getCursor()

    public List<Object> getItems() {
        return items;
    }
}
