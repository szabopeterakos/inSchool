package immutable.satellite;

import sun.applet.AppletIllegalArgumentException;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    List<Satellite> satelliteList = new ArrayList<>();

    public void registerSatellite(Satellite satelliteOBJ) {
        if (satelliteOBJ == null) {
            throw new NullPointerException("Parameter must not be null!");
        }

        satelliteList.add(satelliteOBJ);
    }

    // ASD345: CelestialCoordinates: x=12, y=23, z=45, QWE789: CelestialCoordinates: x=22, y=33, z=44
    public String toString() {
        return satelliteList.toString();
    }

    public Satellite findSatelliteByRegisterIdent(String ID) {
        Satellite temp = null;
        int counter = 0;

        for (Satellite current : satelliteList) {
            if (current.getRegisterIdent().equals(ID)) {
                temp = current;
                counter++;
            }
        }

        if (counter == 0) {
            throw new AppletIllegalArgumentException("Satellite with the given registration cannot be found!");
        }

        return temp;
    }

}
