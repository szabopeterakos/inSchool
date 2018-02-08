package locale;

import java.util.Arrays;
import java.util.Locale;

public class Test {


    public static void main(String[] args) {
        Locale locale = new Locale("hu_HU");
        Locale locale2 = new Locale("hu","HU");
        System.out.println(Locale.getDefault());
        System.out.println(locale.getLanguage() + locale.getCountry());
        System.out.println(Locale.US);
        System.out.println(Arrays.toString(Locale.getAvailableLocales()));


    }

}
