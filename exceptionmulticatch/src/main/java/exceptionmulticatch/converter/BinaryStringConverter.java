package exceptionmulticatch.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String str) {

        boolean[] temp = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.toCharArray()[i] != '1' && str.toCharArray()[i] != '0') {
                throw new IllegalArgumentException();
            }
            if (str.toCharArray()[i] == '1') {
                temp[i] = true;
            }
            if (str.toCharArray()[i] == '0') {
                temp[i] = false;
            }


        }

        return temp;
    }

    public String booleanArrayToBinaryString(boolean[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException();
        }
        StringBuilder temp = new StringBuilder();

        for (boolean c : arr) {

            if (c == true) {
                temp.append("1");
            }
            if (c == false) {
                temp.append("0");
            }
        }

        return temp.toString();
    }

}
