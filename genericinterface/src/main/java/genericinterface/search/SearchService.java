package genericinterface.search;

import genericinterface.Item;
import genericinterface.SearchCriteria;

import java.util.List;

public class SearchService<T extends Item> {

    public T findFirst(List<T> items, SearchCriteria criteria) {
        for (T c : items) {
            if(criteria.pass(c)){
                return c;
            }
        }
        throw new IllegalArgumentException("Item not found");
    }

}
