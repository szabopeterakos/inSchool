package locations.bl;

public class Location { // modell, entitás

    private Long ID;
    private String name;
    private double lat;
    private double lon;

    public Location() {
    }

    public Location(Long ID, String name, double lat, double lon) {
        this.ID = ID;
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }

    public Long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

}
