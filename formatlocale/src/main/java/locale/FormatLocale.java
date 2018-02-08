package locale;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormatLocale {


    public String formatCurrency(double money, Locale locale) {
        localePresent(locale);

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        return numberFormat.format(money);
    }

    public String formatCurrencyByLanguage(double money, String l1, String l2) {
        isEmpty(l1);
        isEmpty(l2);
        localePresent(l1, l2);

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale(l1, l2));
        return nf.format(money);
    }

    public String formatPercentage(Double d, Locale l) {
        localePresent(l);

        return NumberFormat.getPercentInstance(l).format(d);
    }

    public String formatPercentageByLanguage(double money, String l1, String l2) {
        isEmpty(l1);
        isEmpty(l2);
        localePresent(l1, l2);

        return NumberFormat.getPercentInstance(new Locale(l1, l2)).format(money);
    }

    public String formatNumber(Double money, Locale locale) {
        localePresent(locale);

        BigDecimal bd = new BigDecimal(money).setScale(2, BigDecimal.ROUND_HALF_UP);
        return NumberFormat.getNumberInstance(locale).format(bd);
    }

//    public String formatNumber(double number, Locale locale) {
//        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
//        if (numberFormat instanceof DecimalFormat) {
//            ((DecimalFormat) numberFormat).applyPattern("###,###.##");
//        }
//        return numberFormat.format(number);
//    }

    boolean isEmpty(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("Incorrect arguments!");
        }
        return true;
    }

    boolean localePresent(Locale locale) {
        if (locale == null) {
            throw new NullPointerException("Locale must not be null");
        }
        for (Locale c : Locale.getAvailableLocales()) {
            if (c.toString().equals(locale.toString())) {
                return true;
            }
        }
        return false;
    }

    boolean localePresent(String l1, String l2) {
        Locale temp = new Locale(l1, l2);
        for (Locale c : Locale.getAvailableLocales()) {
            if (c.toString().equals(temp.toString())) {
                return true;
            }
        }

        throw new IllegalArgumentException("Incorrect arguments!");
    }

}
