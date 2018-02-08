package packages.numbers;

import packages.string.StringConcat;

public class NumberConcat {
    public String concatenate(int num01, int num02) {
        StringConcat sc = new StringConcat(); // ctrl + space ;
        return sc.concatA(Integer.toString(num01), Integer.toString(num02));

//        return (""+num01+num02);// ez is működik
        // balról jobbra értékel ki, "" miatt szöveg aztán két szám összege
    }
}
