package defaultconstructor.date;

public class SimpleDate {

    private int year;
    private int month;
    private int day;

    public void setDate(int year, int month, int day) {
        if (! isCorrect(year, month, day)) {
            throw new IllegalArgumentException("One or more given parameter cannot be applied!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private boolean isCorrect(int year, int month, int day) {
        if (year <= 1990 || month > 12 || month < 1 || day < 0 || day > calculateMonthLength(year, month)) {
            return false;
        }
        return true;
    }

    private boolean isLeapYear(int year) {
        boolean isLeap = false;
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            isLeap = true;
        }
        if (year % 4 == 0 && year % 100 != 0 && year % 400 != 0) {
            isLeap = true;
        }
        return isLeap;
    }

    private int calculateMonthLength(int year, int month) {
        int[] monthLengths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int currentLength = monthLengths[month + 1];
        if (!isLeapYear(year)) {
            currentLength += 1;
        }

        return currentLength;

    }
}
