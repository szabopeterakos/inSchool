package duration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test {

    // duration idő szintűhossz nem dátumszintű, arra ott a period
    public static void main(String[] args) {
        System.out.println();
        Duration d = Duration.ofHours(2);
        System.out.println(d);
        Duration d2 = Duration.between(LocalTime.now(),LocalTime.of(10,30));
        System.out.println(d2); // nem dátum, hanem idő
        System.out.println(Duration.parse("PT12D"));
        System.out.println(Duration.parse("PT125M")); // normalizálva tárolódik azaz PT2H5M
        // - immutable és szálbiztos - //
        LocalDateTime d3 = (LocalDateTime) Duration.parse("PT2D").addTo(LocalDateTime.now());

    }

}
