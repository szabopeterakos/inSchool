package controlselection.week;

public class DayOfWeeks {

    public String whichDay(String day){
        switch (day.toUpperCase()){
            case "HÉTFŐ":
                return "hét eleje";
            case "KEDD":
            case "SZERDA":
            case "CSÜTÖRTÖK":
                return "hét közepe";
            case "PÉNTEK":
                return "majdnem hétvége";
            case "SZOMBAT":
            case "VASÁRNAP":
                return "hét vége";
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }
    }


}
