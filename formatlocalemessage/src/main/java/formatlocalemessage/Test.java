package formatlocalemessage;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;

public class Test {

    // REGEXP
    // http://vbence.web.elte.hu/regex_leiras.html
    // String.format
    // https://dzone.com/articles/java-string-format-examples

    public static void main(String[] args) {
        System.out.println(MessageFormat.format("The time is now: {0,date,medium} {0,time,medium}", new Date()));
        System.out.println(new MessageFormat("The time is now: {0,date,medium} {0,time,medium}", new Locale("hu_HU")).format(new Object[]{new Date()}));

        System.out.println(MessageFormat.format("There {0,choice,0#are no files|1#is one file|1<are {0,number,integer} files}.", 3));

        String msg = "\nHello {0} \nPlease find attached {1} \nwhich is due on {2}.";
        String[] values = {"John Doe", "invoice #123", "2009-06-30"};
        System.out.println(MessageFormat.format(msg, values));
    }

}
