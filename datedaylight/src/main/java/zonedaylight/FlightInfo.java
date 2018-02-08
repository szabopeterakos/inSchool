package zonedaylight;

import java.text.Normalizer;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FlightInfo {

    private ZonedDateTime departure;
    public static final String PATTERN = "HHmm, dd MMM yyyy";
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(PATTERN, Locale.ENGLISH);

    // new FlightInfo("1830, 14 Mar 2013", PATTERN, Locale.ENGLISH, ZoneId.of(ZoneId.SHORT_IDS.get("PST")));
    public FlightInfo(String dateString, String pattern, Locale locale, ZoneId zone) {
        if (isEmpty(dateString)) {
            throw new IllegalArgumentException("Empty date string parameter!");
        }
        if (isEmpty(pattern)) {
            throw new IllegalArgumentException("Empty pattern string parameter!");
        }
        if (locale == null) {
            throw new NullPointerException("Locale must not be null!");
        }
        if (zone == null) {
            throw new NullPointerException("Zone must not be null!");
        }


        LocalDateTime ldt = LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern(pattern, locale));
        ZonedDateTime zdt = ZonedDateTime.of(ldt,zone);
        this.departure = zdt;



    }

    public ZonedDateTime getArrivalDateTime(ZoneId zone, int flightHours, int flightMinutes) {
        return departure.plusHours(flightHours).plusMinutes(flightMinutes).withZoneSameInstant(zone);
    }

    public ZonedDateTime getDepartureDateTime() {
        return this.departure;
    }

    private boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }


}
