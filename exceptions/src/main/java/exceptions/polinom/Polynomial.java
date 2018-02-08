package exceptions.polinom;

public class Polynomial {

    private double[] polinoms; // Coefficients :)

    public Polynomial(double[] polinoms) {
        if (polinoms == null) {
            throw new NullPointerException("coefficients is null");
        }
        this.polinoms = polinoms;
    }

    public Polynomial(String[] polinoms) {
        if (polinoms == null) {
            throw new NullPointerException("coefficientStrs is null");
        }

        double[] temp = new double[polinoms.length];

        try {
            int counter = 0;
            for (String c : polinoms) {
                temp[counter] = Double.parseDouble(c);
                counter++;
            }
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Illegal coefficients, not a number", nfe);
        }
        this.polinoms = temp;
    }


    public double[] getCoefficients() {
        return polinoms;
    }

    public double evaluate(double x) {
        double temp = 0;

        int powNum = polinoms.length - 1;
        for (int i = 0; i < polinoms.length; i++) {
            temp += Math.pow(x, powNum) * polinoms[i];
            powNum--;
        }

        return temp;

    }

}
