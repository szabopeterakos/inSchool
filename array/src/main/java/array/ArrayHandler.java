package array;

import java.util.Arrays;

public class ArrayHandler {

    int[] append(int[] source, int item) {
        int[] ff = new int[source.length + 1];
        ff[ff.length - 1] = item;
        return ff;
    }

    int[] append2(int[] source, int item) {
        int[] ff = new int[source.length + 1];
        System.arraycopy(source, 0, ff, 0, source.length);
        ff[source.length - 1] = item;
        return ff;
    }

    boolean contains(int[] source, int itemToFind) {
        boolean temp = false;
        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) {
                temp = true;
            }
        }
        return temp;
    }

    int find(int[] source, int itemToFind) {
        int temp = -1;
        for (int i = 0; i < source.length; i++) {
            if (source[i] == itemToFind) {
                temp = i;
            }
        }
        return temp;
    }


    int[] insert(int[] source, int index, int item) {
        int[] xx = new int[source.length + 1];
        System.arraycopy(source, 0, xx, 0, index);
        xx[index] = item;
        int[] yy = new int[xx.length];
        System.arraycopy(source, index, yy, index + 1, source.length - index);
        return yy;
    }


    int[] remove(int[] source, int index) {
        int[] tempArr01 = new int[source.length - 1];
        int[] tempArr02 = new int[source.length - 1];
        System.arraycopy(source, 0, tempArr01, 0, index);
        System.arraycopy(source, index - 1, tempArr02, index, source.length - index);

        // indexnél vágás eleje index hosszú, a vége hossz-index;(index előtt vág----)

        return tempArr02;
    }

    int[] insertAll(int[] source, int start, int[] items) {
        int[] arr = new int[source.length + items.length];
        System.arraycopy(source, 0, arr, 0, start);

        for (int i = 0; i < items.length; i++) {
            arr[i + start] = items[i];
        }

        System.arraycopy(
                source, start,
                arr, start + items.length,
                source.length - start);
        return arr;
    }

    int[] removeAll(int[] source, int start, int end) {
        try {
            int[] arr = new int[source.length - (end - start)];
            System.arraycopy(source, 0, arr, 0, start);
            System.arraycopy(source, end, arr, start, source.length - end);
            return arr;
        } catch (NegativeArraySizeException ex){
            System.out.println("ERROR HEJ ");
            return null;
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("MÁSIK IZÉ ");
            return null;
        }
    }


    public static void main(String[] args) {
        ArrayHandler xx = new ArrayHandler();
        int[] timi = {1, 2, 3,4};
        int[] plus = {111, 222};

        System.out.println(Arrays.toString(xx.removeAll(timi,4,6)));
    }
}
