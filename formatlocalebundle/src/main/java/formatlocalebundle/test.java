package formatlocalebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class test {

    public static void main(String[] args) {
        System.out.println(Locale.GERMANY);

        Locale l = new Locale("hu_HU");
        ResourceBundle rb = ResourceBundle.getBundle("test",Locale.GERMANY);
        System.out.println(rb.getString("save"));

    }

}
