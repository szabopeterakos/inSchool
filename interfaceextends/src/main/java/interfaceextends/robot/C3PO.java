package interfaceextends.robot;

import java.util.ArrayList;
import java.util.List;

public class C3PO implements MoveableRobot {

    private Point position;
    private int angle;
    private List<Point> path= new ArrayList<>();

    public C3PO(Point position){
     this.position = position;
    }

    public void moveTo(Point position){
        path.add(position);
        this.position = position;
    }
    public void fastMoveTo(Point position){
        moveTo(position);
    }
    public void rotate(int angle){
        this.angle += angle;
    }

    //private void walkTo(Point position){}

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }

    @Override
    public List<Point> getPath() {
        return this.path;
    }
}
