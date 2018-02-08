package dateoldtypes;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getTime());
        System.out.println(d);
        // date-ben nincs időzóna választás, rendszeridővel dolgozik
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        c.set(2014,0,1);
        System.out.println(c.getTime());
        System.out.println(c.get(2)); // nap év hónap, 0,1,2
        Date dd = c.getTime();
        c.setTime(dd);
        
    }
}
