package datenewtypes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateOfBirth {

    LocalDate localDate;

    public DateOfBirth(String date, String format, Locale locale) {
        if(isBlank(format)){
           throw new IllegalArgumentException("Empty pattern string");
        }
        if(isBlank(date)){
            throw new IllegalArgumentException("Empty date string");
        }
        if(isBlank(locale)){
            throw new NullPointerException("Locale must not be null");
        }
        this.localDate = LocalDate.parse(date,DateTimeFormatter.ofPattern(format,locale));
    }

    public DateOfBirth(String date, String format) {
        if(isBlank(format)){
            throw new IllegalArgumentException("Empty pattern string");
        }
        if(isBlank(date)){
            throw new IllegalArgumentException("Empty date string");
        }
        this.localDate = LocalDate.parse(date,DateTimeFormatter.ofPattern(format));
    }
    public DateOfBirth(int a, int b, int c) {
        this.localDate = LocalDate.of(a,b,c);
    }
    public DateOfBirth(String date) {
        if(isBlank(date)){
            throw new IllegalArgumentException("Empty date string");
        }
        this.localDate = LocalDate.parse(date);
    }

    private boolean isBlank(String str){
        if(str == null || str.isEmpty()){
            return true;
        }
        return false;
    }
    private boolean isBlank(Locale str){
        if(str == null){
            return true;
        }
        return false;
    }

    public String toString(String pattern) {
        if(isBlank(pattern)){
            throw new IllegalArgumentException("Empty pattern string");
        }
        return localDate.format(DateTimeFormatter.ofPattern(pattern));
    }

    public String findDayOfWeekForBirthDate(Locale locale){
        if(isBlank(locale)){
            throw new NullPointerException("Locale must not be null");
        }
        return localDate.getDayOfWeek().toString().substring(0,1)+localDate.getDayOfWeek().toString().substring(1).toLowerCase();
    }

    public int countDaysSinceBirth(){
        if(localDate.isAfter(LocalDate.now())){
            throw new IllegalStateException("Birthdate is in the future");
        }
        return (int) ChronoUnit.DAYS.between(localDate, LocalDate.now());
    }

    public LocalDate getDateOfBirth() {
        return localDate;
    }

    public int countDaysBetween(DateOfBirth dob){
        Long i = this.localDate.toEpochDay() - dob.localDate.toEpochDay();
        return Math.abs(i.intValue());
    }


}
