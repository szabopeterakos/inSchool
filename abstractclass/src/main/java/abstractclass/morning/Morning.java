package abstractclass.morning;

import java.util.ArrayList;
import java.util.List;

public class Morning {

    public List<Integer> arrPerBandC(List<Integer> list, int b, int c) {
        List<Integer> temp = new ArrayList<>();
        for (Integer current : list) {
            if (current % b == 0 && current % c == 0) {
                temp.add(current);
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Morning morning = new Morning();
        List<Integer> tester = new ArrayList<>();

        int start = 0;
        int end = 60;

        for (int i = start; i <= end; i++) {
            tester.add(i);
        }

        System.out.println(morning.arrPerBandC(tester, 10, 20));
    }

}
