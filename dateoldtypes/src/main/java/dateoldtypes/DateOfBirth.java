package dateoldtypes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateOfBirth {

    private Date dateOfBirth;

    public DateOfBirth(int year, int month, int day) {
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day);
        c.setLenient(false);

        this.dateOfBirth = c.getTime();
    }

    public DateOfBirth(String dateString, String pattern, Locale locale) {
        if (isEmpty(dateString)) {
            throw new IllegalArgumentException("Illegal date string");
        }
        if (isEmpty(pattern)) {
            throw new IllegalArgumentException("Illegal pattern string");
        }
        if (locale == null) {
            throw new NullPointerException("Locale must not be null!");
        }

        DateFormat format = new SimpleDateFormat(pattern, locale);
        format.setLenient(false);
        setDateOfBirth(dateString, format);

    }

    public DateOfBirth(String dateString, String pattern) {
        if (isEmpty(dateString)) {
            throw new IllegalArgumentException("Illegal date string");
        }
        if (isEmpty(pattern)) {
            throw new IllegalArgumentException("Illegal pattern string");
        }

        DateFormat format = new SimpleDateFormat(pattern);
        format.setLenient(true);
        setDateOfBirth(dateString, format);

    }

    public String findDayOfWeekForBirthDate(Locale locale) {
        if (locale == null) {
            throw new NullPointerException("Locale must not be null!");
        }

        return new SimpleDateFormat("EEEE", locale).format(dateOfBirth.getTime());
    }

    public String toString(String pattern) {
        if (pattern == null || pattern.trim().length() == 0) {
            throw new IllegalArgumentException("Illegal pattern string");
        }

        DateFormat format = new SimpleDateFormat(pattern);
        format.setLenient(true);
        return format.format(dateOfBirth.getTime());

    }

    public boolean isWeekDay() {
        Calendar c = Calendar.getInstance();
        c.setTime(dateOfBirth);

        /////////////////////////////////////////////
        int cDayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        return (cDayOfWeek > 1 && cDayOfWeek < 7) ? true : false;

    }

    private boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    private void setDateOfBirth(String dateString, DateFormat dateFormat) {
        dateFormat.setLenient(false);
        try {
            this.dateOfBirth = dateFormat.parse(dateString);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Illegal date string");
        }

    }

}
