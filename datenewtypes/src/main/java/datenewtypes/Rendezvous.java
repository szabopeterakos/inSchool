package datenewtypes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Rendezvous {

    LocalTime localTime;

    public Rendezvous(String l1, String l2) {
        if (isEmpty(l1) || l1.length()!=5) {
            throw new IllegalArgumentException("Illegal time string");
        }
        if (isEmpty(l2)) {
            throw new IllegalArgumentException("Empty pattern string");
        }

        DateTimeFormatter format = DateTimeFormatter.ofPattern(l2);
        this.localTime = LocalTime.parse(l1);
    }

    public Rendezvous(int hh, int mm) {
        this.localTime = LocalTime.of(hh, mm);
    }


    public String toString(String pattern) {
        if (isEmpty(pattern)) {
            throw new IllegalArgumentException("Empty pattern string");
        }

        DateTimeFormatter f = DateTimeFormatter.ofPattern(pattern);
        return localTime.format(f);
    }

    private boolean isEmpty(String s) {
        if (s == null || s.trim().length() == 0) {
            return true;
        }
        return false;
    }

    public int countMinutesLeft() {
        int temp = LocalTime.now().getMinute() - localTime.getMinute();
        if (localTime.isBefore(LocalTime.now())) {
            throw new MissedOpportunityException("Too late!");
        }
        return temp;
    }

    public void pushLater(int hh, int mm) {
        this.localTime = localTime.plusHours(hh).plusMinutes(mm);
    }


    public void pullEarlier(int hh, int mm) {
        this.localTime = localTime.minusHours(hh).minusMinutes(mm);
    }
}
