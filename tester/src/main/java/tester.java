import java.time.LocalDate;
import java.util.*;

public class tester {

    int i1;
    long i2;

    private tester(int i1, long i2) {
        this.i1 = i1;
        this.i2 = i2;
    }

    public static void main(String[] args) {
        System.out.println("START");

        tester tTT = new tester(33,33);
        System.out.println(tTT.i2);
    }


}
