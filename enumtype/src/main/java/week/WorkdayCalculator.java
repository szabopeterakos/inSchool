package week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    List<DayType> dayTypes(Day firstDay, int numberOfDays) { // újra átnézni
        List<DayType> temp = new ArrayList<DayType>();
        Day cday = firstDay;
        temp.add(firstDay.getTypeOfTheDay());
        for(int i = 0; i < numberOfDays-1; i++){
        cday = nextDay(cday);
        temp.add(cday.getTypeOfTheDay());
        }
        return temp;
    }


    private Day nextDay(Day day) {
        Day temp;
        if (day.ordinal() == 6) {
            temp = Day.values()[0];
        } else {
            temp = Day.values()[day.ordinal() + 1]; // day.ordinal index-et ad vissza.
        }
        return temp;

    }


}
