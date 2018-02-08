package formatlocaleprintf;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormat {

    public boolean checkException(String formatString, Integer i, Integer j) {
        int counter = 0;
        for (char c : formatString.toCharArray()) {
            if (c == '%') {
                counter++;
            }

        }
        if (counter != 2) {
            throw new IllegalArgumentException("Less objects then expected in format String!");
        }
        return true;
    }

    public String formatMessageWithIntegerParameters(String formatString, Integer i, Integer j) {
        checkException(formatString, i, j);
        return null;
    }

    public String printFormattedText1(Double number) {  // "Total is: 561 123,20 Ft"
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(' ');
        DecimalFormat df = new DecimalFormat("###,###.00 Ft", symbols);
        String temp = df.format(number).replace(".", ",");
        return String.format("%s", temp);
    }

    public String printFormattedText(Double number) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("hu", "HU"));
        formatter.setMinimumFractionDigits(2);
        String moneyString = String.format("Total is: %s", formatter.format(number));
        return moneyString;
    }


    public String printFormattedText(int count, String fruit) {
        return String.format("We counted %d %s in the basket", count, fruit);

    }

    public String printFormattedText(int number) {
        return String.format("Right edge of numbers set at 4 spaces from text:%4d", number);

    }

    public String printFormattedText(Integer i, Integer j, Integer k) {
        return String.format("Multiple objects containing text:%d\t%d\t%d", i, j, k);
    }
}
