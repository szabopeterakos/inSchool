package immutable.satellite;

import sun.applet.AppletIllegalArgumentException;

public class Satellite {

    private CelestialCoordinates coordinates;
    private String registerIdent;

    public String getRegisterIdent() {
        return registerIdent;
    }

    public Satellite(CelestialCoordinates coordinates, String registerIdent) {
        if(registerIdent.isEmpty()){
            throw new AppletIllegalArgumentException("Register ident must not be empty!");
        }

        this.coordinates = coordinates;
        this.registerIdent = registerIdent;
    }

    public void modifyDestination(CelestialCoordinates diff){
        CelestialCoordinates l = new CelestialCoordinates(coordinates.getX()+diff.getX(),coordinates.getY()+diff.getY(),coordinates.getZ()+diff.getZ());
        this.coordinates = l;
    }

    public String toString(){
       return registerIdent+": " + coordinates.toString();
    }


}
