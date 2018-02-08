package methodchain.robot;

import java.util.ArrayList;
import java.util.List;

public class NavigationPoint {

    private int distance=0;
    private int azimut=0;


    public NavigationPoint(int distance, int azimut) {
        this.distance = distance;
        this.azimut = azimut;
    }

    public NavigationPoint setDistance(int distance) {
        this.distance = distance;
        return this;
    }

    public NavigationPoint setAzimut(int azimut) {
        this.azimut = azimut;
        return this;
    }

    public int getDistance() {
        return distance;
    }

    public int getAzimut() {
        return azimut;
    }

    //    // "[distance: 5 azimut: 45, distance: 15 azimut: 30]")

    @Override
    public String toString() {
        String res = "";

        res += "distance: " + getDistance() + " azimut: " + getAzimut();

        return res;
    }
}
