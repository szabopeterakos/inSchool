package zonedaylight;

import java.time.*;

public class test {

    public static void main(String[] args) {
        System.out.println(ZoneId.getAvailableZoneIds());
        System.out.println(ZoneId.of("Europe/Budapest"));
        System.out.println();

        ZoneId zoneId = ZoneId.of("Pacific/Kwajalein");
        System.out.println(zoneId);

        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("Europe/Brussels")); // tárolja a zónát és a dátumidőt is.
        System.out.println(zdt);
        System.out.println(zdt.withZoneSameInstant(ZoneId.of("Europe/Budapest")));

        System.out.println();

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.of(2017, Month.MARCH, 26, 1, 59), ZoneId.of("Europe/Budapest"));
        // 2017-03-26T01:59+01:00[Europe/Budapest]

        zonedDateTime = zonedDateTime.plus(Duration.ofMinutes(1));
        System.out.println(zonedDateTime);

        // 2017-03-26T03:00+02:00[Europe/Budapest]

        ZonedDateTime start = ZonedDateTime.of(LocalDateTime.of(2017, Month.MARCH, 26, 1, 00), ZoneId.of("Europe/Budapest"));
        // 2017-03-26T01:00+01:00[Europe/Budapest]
        ZonedDateTime end = ZonedDateTime.of(LocalDateTime.of(2017, Month.MARCH, 26, 6, 00), ZoneId.of("Europe/Budapest"));
        // 2017-03-26T06:00+02:00[Europe/Budapest]
        Duration duration = Duration.between(start, end); // PT4H
        System.out.println(duration);

    }

}
