package immutable.satellite;

public class CelestialCoordinates {

    public final int x;
    public final int y;
    public final int z;

    public CelestialCoordinates(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString(){
        return "CelestialCoordinates: x="+x+", y="+y+", z="+z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}
