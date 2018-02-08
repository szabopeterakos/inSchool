package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot {

    private Point position;
    private int angle;
    private List<Point> path = new ArrayList<>();

    public static final long ALTITUDE = 5;

    public AstroBoy(Point position){
        this.position = position;
    }

    public void walkTo(Point position){
        path.add(position);
        this.position = position;
    }

    public void flyTo(Point position){
        this.position = new Point(position.getX(),position.getY(),ALTITUDE); // new ???
        path.add(this.position);

    }

    public void liftTo(long altitude){
        this.position = new Point(position.getX(), position.getY(), altitude); // this???
        path.add(position);

    }

    // delegálja a funkciót
    public void moveTo(Point position){
        walkTo(position);
    }

    //komplex mozgás, felemelkedik, elrepül a célpont fölé, és leereszkedik
    public void fastMoveTo(Point position){
        liftTo(ALTITUDE);
        flyTo(position);
        liftTo(0);
    }

    public void rotate(int angle){
        this.angle += angle;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    public long getAltitude() {
        return position.getZ();
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    @Override
    public List<Point> getPath() {
        return path;
    }

}
