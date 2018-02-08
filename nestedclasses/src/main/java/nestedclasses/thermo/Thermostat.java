package nestedclasses.thermo;

import java.util.ArrayList;
import java.util.List;

public class Thermostat {

    private List<String> roomsToHeatList = new ArrayList<>();
    private List<Thermometer> thermometerList = new ArrayList<>();
    private final int temperatureLimit = 23;


    public void addThermometer(Thermometer thermometer) {
        thermometerList.add(thermometer);
        thermometer.setThermometerObserver(new ThermometerObserver() {
            @Override
            public void handleTemperatureChange(int temp, String room) {
                if (thermometer.getRoomTemperature() < temperatureLimit) {
                    roomsToHeatList.add(thermometer.getRoomNumber());
                } else {
                    roomsToHeatList.remove(thermometer.getRoomNumber());
                }
            }
        });
    }

    public List<String> getRoomsToHeat() {
        return roomsToHeatList;
    }

    public List<Thermometer> getThermometer() {
        return thermometerList;
    }
}
