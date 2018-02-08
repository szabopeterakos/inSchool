package formatlocalebundle;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Translator {

    private static final Locale HUNGARIAN = new Locale("hu_HU");

    public String englishToHungarian(String eng) {
        ResourceBundle br;
        try {
            br = ResourceBundle.getBundle("library", HUNGARIAN);
            return br.getString(eng);
        } catch (MissingResourceException missingResourceExeption) {
            throw new IllegalArgumentException("Key not found");
        }

    }

    public String englishToGerman(String eng) {
        ResourceBundle rb = ResourceBundle.getBundle("library", Locale.GERMANY);
        return rb.getString(eng);
    }

}
