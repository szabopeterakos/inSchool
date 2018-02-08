package unit;

public enum LengthUnit {

    MILLIMETER(true,1.0),
    CENTIMETER(true,10.0),
    METER(true,1000.0),

    YARD(false, 914.4),
    FOOT(false, 304.8),
    INCH(false, 25.4);

    private final boolean IS_IS;
    private final double LENGTH_IN_MM;

    LengthUnit(boolean IS_IS, double LENGTH_IN_MM) {
        this.IS_IS = IS_IS;
        this.LENGTH_IN_MM = LENGTH_IN_MM;
    }

    public boolean isIS_IS() {
        return IS_IS;
    }

    public double isLENGTH_IN_MM() {
        return LENGTH_IN_MM;
    }
}
