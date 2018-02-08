package arrayofarrays;

import java.util.Arrays;

public class ArrayOfArraysMain {
    int[][] multiplicationTable(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }
        return arr;
    }

    public void printer(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printer2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public void printer3(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(String.format("%5d", arr[i][j]));
            }
            System.out.println();
        }
    }

    public void printArrayOfArrays(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    int[][] triangularMatrix(int size) {
        int[][] arr = new int[size][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1]; // itt hozom be a másik dimenzióját
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i;
            }
        }
        return arr;
    }

    // ugy sza ahogy van
    int[][] getValues() {
        int[][] arr = new int[12][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = i;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[][] arrTest = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ArrayOfArraysMain xx = new ArrayOfArraysMain();

        xx.printer(arrTest);
        System.out.println();
        xx.printer2(arrTest);

        System.out.println();
        xx.printer2(xx.multiplicationTable(14));
        xx.printer3(xx.multiplicationTable(14));

        System.out.println();
        xx.printArrayOfArrays(arrTest);

        System.out.println();
        xx.printArrayOfArrays(xx.triangularMatrix(5));

        xx.printArrayOfArrays(xx.getValues());
    }
}
