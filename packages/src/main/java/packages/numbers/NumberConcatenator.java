package packages.numbers;


import packages.strings.StringConcatenator;

public class NumberConcatenator {
    public String concatenate(int a, int b) {
        return Integer.toString(a) + Integer.toString(b);
    }

    public String concatenate01(int a, int b) {
        StringConcatenator sc = new StringConcatenator();
        return sc.concatenate(Integer.toString(a), Integer.toString(b));
    }

    public int concatenate02(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        NumberConcatenator sc = new NumberConcatenator();
        String temp = sc.concatenate(12, 23);
        System.out.println(temp);

        //NumberConcatenator sc02 = new NumberConcatenator();
        int temp01 = sc.concatenate02(12, 23);
        System.out.println(temp01);
    }
}
