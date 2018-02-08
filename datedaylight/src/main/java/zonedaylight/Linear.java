package zonedaylight;

import java.util.ArrayList;
import java.util.List;

public class Linear { // mi a szépség amiket szakmailag alá tudsz támasztani.

    public boolean isLinear(int[] arr) {
        List<Boolean> increase = new ArrayList<>();
        List<Boolean> decrease = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                increase.add(true);
            } else {
                increase.add(false);
            }

            if (arr[i] > arr[i + 1]) {
                decrease.add(true);
            } else {
                decrease.add(false);
            }
        }
        if (!increase.contains(false)) {
            return true;
        }
        if (!decrease.contains(false)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Linear l = new Linear();
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {6,1,2,3,4,5};
        int[] arr3 = {4,3,2};

        System.out.println(l.isLinear(arr)); // true
        System.out.println(l.isLinear(arr2)); // false
        System.out.println(l.isLinear(arr3)); // true

    }

}
