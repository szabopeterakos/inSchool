package arrayofarrays;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        System.out.println(Arrays.deepToString(arr));

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}
