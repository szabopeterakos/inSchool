package abstractclass.gamecharacter;

public class Point {

    private long x;
    private long y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance(Point otherPoint){
        double d;
        long a = this.getX()-otherPoint.getX();
        long b = this.getY()-otherPoint.getY();
        d = Math.pow(Math.abs(a),2) + Math.pow(Math.abs(b),2);
        d = Math.sqrt(d);
        return (long) d;
    }

}
