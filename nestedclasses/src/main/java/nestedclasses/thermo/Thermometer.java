package nestedclasses.thermo;

public class Thermometer { // egy hőmérőt reprezentál
    private String roomNumber;
    private int roomTemperature;
    private ThermometerObserver thermometerObserver;

    public Thermometer(String roomNumber, int roomTemperature) {
        this.roomNumber = roomNumber;
        this.roomTemperature = roomTemperature;
        this.thermometerObserver = null;
    }

    public void setTemperature(int temperature) {
        this.roomTemperature = temperature;
        onTemperatureChanged();
    }

    public void onTemperatureChanged(){
        if(this.thermometerObserver != null){
            thermometerObserver.handleTemperatureChange(roomTemperature,roomNumber);
        }
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getRoomTemperature() {
        return roomTemperature;
    }

    public ThermometerObserver getThermometerObserver() {
        return thermometerObserver;
    }

    public void setThermometerObserver(ThermometerObserver observer) {
        //Figyeljünk rá, hogy a figyelő bejegyzése hőmérséklet változásnak számít.
        this.thermometerObserver = observer;
        onTemperatureChanged();
    }
}