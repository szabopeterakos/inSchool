package primitivetypes;

public class PrimitiveTypes {

    String toBinaryString(int n) {
        String str = "";
        String str2 = "";
        String zeros = "";
        String positive = "";
        int hagySzamjegy = 32;
        int i = Math.abs(n);
        int j;
        while (i > 0) {
            //System.out.print(i);
            j = i % 2;
            //System.out.print(j);
            str += j;
            i = (int) i / (int) 2;
        }
        char[] charArray = str.toCharArray();

        for (int k = 0; k < charArray.length; k++) {
            str2 += charArray[charArray.length - k - 1];
        }

        for (int u = 0; u < (hagySzamjegy - str2.length()); u++) {
            zeros += "0";
        }

        // pozitiv to negative
        if (n < 0) {
            String temp = zeros + str2;
            char[] chrArrayPositiveWithZero = temp.toCharArray();
            String negateWithZero = "";

            for(int rr = 0; rr < chrArrayPositiveWithZero.length; rr++){
                chrArrayPositiveWithZero[rr] = flip(chrArrayPositiveWithZero[rr]);
            }

            for (int g = 0; g < chrArrayPositiveWithZero.length; g++) {
                if(chrArrayPositiveWithZero[chrArrayPositiveWithZero.length-1-g] == '0'){
                    chrArrayPositiveWithZero[chrArrayPositiveWithZero.length-1-g] = '1';
                    break;
                }

            }

            for(int gg = 0; gg < chrArrayPositiveWithZero.length; gg++){
                negateWithZero += chrArrayPositiveWithZero[gg];
            }


            return negateWithZero;
        }
        return zeros + str2;
    }

    char flip(char c) {
        return (c == '0') ? '1' : '0'; // int az if csak kiemelve flip-be
    }


}
