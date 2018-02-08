package zonedaylight;

import java.time.Duration;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class WorkHoursCalculator {

    // new WorkHoursCalculator(2013, Month.MARCH, 5, 1, ZoneId.of("America/Chicago"));
    ZonedDateTime start;

    public WorkHoursCalculator(int startYear, Month startMonth, int startDay, int startHour, ZoneId zone){
        ZonedDateTime t = ZonedDateTime.of(startYear,startMonth.getValue(),startDay,startHour,0,0,0,zone);
        this.start = t;
    }

    public long calculateHours(int year, Month month, int day, int hour){
        ZonedDateTime another = ZonedDateTime.of(year,month.getValue(),day,hour,0,0,0,start.getZone());

        return Duration.between(this.start, another).toHours();
    }

    public ZonedDateTime getStartDateTime(){
        return start;
    }

}
