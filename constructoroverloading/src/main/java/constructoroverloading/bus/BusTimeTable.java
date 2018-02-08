package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable;

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

//    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
//        List<SimpleTime> tempList = new ArrayList<>();
//        for (int i = firstHour; i <= lastHour; i++) {
//            int minutes = 0;
//            if (minutes + everyMinute < 60) {
//                minutes += everyMinute;
//                tempList.add(new SimpleTime(i, minutes));
//            }
//            if (minutes + everyMinute > 60) {
//                minutes = 60 - (minutes + everyMinute);
//                tempList.add(new SimpleTime(i+1, minutes));
//
//            }
//
//        }
//    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinutes) {
        List<SimpleTime> tempList = new ArrayList<>();
        for (int i = firstHour; i <= lastHour; i++) {
            tempList.add(new SimpleTime(i, everyMinutes));
        }
        this.timeTable = tempList;
    }

    public List<SimpleTime> getTimeTable() {
        return this.timeTable;
    }

    public SimpleTime nextBus(SimpleTime actual) {

        SimpleTime res;

        for (int i = 0; i < timeTable.size() - 1; i++) {
            if(timeTable.get(i).difference(actual) > 0){
                return timeTable.get(i);
            }
        }

        throw new IllegalStateException("No more buses today!");
    }

//    SimpleTime nextBus = null;
//
//    int difference = Integer.MIN_VALUE;
//
//        for (SimpleTime busDeparture: timeTable) {
//        int differenceTemp = actual.difference(busDeparture);
//        if (differenceTemp < 0 && differenceTemp > difference) {
//            difference = differenceTemp;
//            nextBus = busDeparture;
//        }
//    }
//
//        if (nextBus == null) {
//        throw new IllegalStateException("No more buses today!");
//    }
//
//        return nextBus;

    public SimpleTime firstBus(){
        SimpleTime res = null;

        for (int i = 1; i < timeTable.size() - 1; i++) {
            res = timeTable.get(0);
            if(timeTable.get(i).difference(res) < 0){
                res = timeTable.get(i);
            }
        }

        return res;
    }

}
