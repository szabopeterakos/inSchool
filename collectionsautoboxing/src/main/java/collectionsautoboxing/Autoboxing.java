package collectionsautoboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Autoboxing {

    public List<Integer> createList(int... nums){
        List<Integer> temp = new ArrayList<>();
        for(Integer c : nums){
            temp.add(c);
        }
        return temp;
    }

    public int sumIntegerList(List<Integer> list){
        int sum = 0;
        for(Integer c : list){
            sum+=c.intValue();
        }
        return sum;
    }

    public int sumIntegerObjects(int... list){
        int sum = 0;
        for(Integer c : list){
            sum+=c.intValue();
        }
        return sum;
    }

}
