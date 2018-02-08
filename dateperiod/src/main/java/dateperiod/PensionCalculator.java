package dateperiod;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PensionCalculator {

    private static final int DAYS_IN_MONTH = 30;
    private static final int DAYS_IN_YEAR = 365;
    private List<Period> periods = new ArrayList<>();

    public void addEmploymentPeriod(Period period) {
        isValid(period);
        periods.add(fullyNormalized(period));
    }

    public Period sumEmploymentPeriods() {
        Period sum = Period.ZERO;
        for (Period period : periods) {
            sum = sum.plus(period);
        }
        return sum;
    }

    public int calculateTotalDays(Period period) {
        isValid(period);
        return period.getYears() * DAYS_IN_YEAR + period.getMonths() * DAYS_IN_MONTH + period.getDays();
    }

    public Period modifyByDays(Period period, int days) {
        isValid(period);
        return fullyNormalized(period.plusDays(days));
    }

    public Period getPeriodBetweenDates(LocalDate fromDate, LocalDate toDate) {
        isValid(fromDate, toDate);
        return Period.between(fromDate, toDate);
    }

    public Period getPeriodBetweenDates(String fromDateString, String toDateString, String pattern) {
        if (isEmpty(fromDateString)) throw new IllegalArgumentException("Empty from date string, cannot use");
        if (isEmpty(toDateString)) throw new IllegalArgumentException("Empty to date string, cannot use");
        if (isEmpty(pattern)) throw new IllegalArgumentException("Empty pattern string, cannot use");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate fromDate = LocalDate.parse(fromDateString, formatter);
        LocalDate toDate = LocalDate.parse(toDateString, formatter);
        return Period.between(fromDate, toDate);
    }

    private Period fullyNormalized2(Period period) {
        if (period.getDays() >= DAYS_IN_MONTH) {
            int plusMonth = period.getDays() / DAYS_IN_MONTH;
            period = period.plusMonths(plusMonth);
            period = period.minusDays(plusMonth * DAYS_IN_MONTH);
        }
        return period.normalized();
    }

    private Period fullyNormalized(Period period) {
        return period.normalized();
    }

    private Period fullyNormalized1(Period period) {
        int day = period.getDays();
        int plusmonth = day / DAYS_IN_MONTH;
        period = period.minusDays(plusmonth * DAYS_IN_MONTH);
        period = period.plusMonths(plusmonth);
        return period.normalized();
    }


    private void isValid(Object... objects) {
        for (Object o : objects) {
            if (o == null) throw new NullPointerException("Null parameters are not allowed!");
        }
    }

    private boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }


}
