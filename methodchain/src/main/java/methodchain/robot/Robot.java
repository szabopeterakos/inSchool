package methodchain.robot;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private int distance = 0;
    private int azimut = 0;
    private List<NavigationPoint> robotList = new ArrayList<>();

    public Robot(int distance, int azimut) {
        this.distance = distance;
        this.azimut = azimut;
    }

    public Robot() {
    }

    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }

    public Robot go(int meter) {
        this.distance += meter;
        return this;
    }

    public Robot rotate(int angle) {
        this.azimut += angle;
        return this;
    }

    public Robot registerNavigationPoint() {
        robotList.add(new NavigationPoint(distance, azimut));
        return this;
    }

    public List<NavigationPoint> getNavigationList() {
        return robotList;
    }

}
