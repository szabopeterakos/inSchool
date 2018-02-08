package course;

public class SimpleTime {

    private int hour;
    private int minute;
    private String fullText;

    public void checker(int hour, int minute){
        if(hour < 0 || hour > 23){
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        if(minute < 0 || minute > 59){
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
    }


    public void checkerSting(String testable){
        if(testable == null){
            throw new InvalidTimeException("Time is null");
        }
        if(testable.isEmpty()){
            throw new InvalidTimeException("üres string");
        }
        if(testable.length() < 5 || !testable.substring(2,3).equals(":")){
            throw new InvalidTimeException("Time is not hh:mm");
        }
    }

    public SimpleTime(int hour, int minute) {
        checker(hour, minute);

        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String full) {
        checkerSting(full);
        try {
            if(full.substring(0,1) == "0"){
                this.hour = Integer.parseInt(full.substring(1, 2));
            } else{
                this.hour = Integer.parseInt(full.substring(0, 2));
            }

        } catch (NumberFormatException nfe){
            throw new InvalidTimeException("Time is not hh:mm");
        }
        try {
            if(full.substring(3,4) == "0"){
                this.minute = Integer.parseInt(full.substring(4,5));
            } else{
                this.minute = Integer.parseInt(full.substring(3,5));
            }

        } catch (NumberFormatException nfe){
            throw new InvalidTimeException("Time is not hh:mm");
        }

        this.fullText = full;
        checker(this.hour,this.minute);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return String.format(String.format("%02d:%02d", hour, minute));
    }
}
