package introconstructors;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    List<String> menu = new ArrayList<>();
    String name;
    int capacity;

    Restaurant(String name, int numberOfTables, String[] list){
        this.name = name;
        this.capacity = (numberOfTables * 4);
        this.menu = menuCreator(list);
    }

    public List<String> menuCreator(String[] menu){
        List<String> temp = new ArrayList<>();
        for(String dish : menu ){
            temp.add(dish);
        }
        return temp;
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getAll(){
        return "Az étterem neve : " + name + "\n"
                + "Befogadó képessége : " + capacity + "\n" +
                "Menüje : " + menu;
    }
}
