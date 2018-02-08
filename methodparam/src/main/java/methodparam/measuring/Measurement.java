package methodparam.measuring;

public class Measurement {

    private double[] values;

    public Measurement(double[] values) {
        this.values = values;
    }

    public int findFirstIndexInLimit(int lower, int upper) {
        int find = -1;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] > lower && this.values[i] < upper) {
                find = i;
                break;
            }
        }
        return find;
    }

    public double minimum() {
        double min = this.values[0];
        for (double current : this.values) {
            if (current < min) {
                min = current;
            }
        }
        return min;
    }

    public double maximum() {
        double max = this.values[0];
        for (double current : this.values) {
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    // külső osztályban tárolódik a két lekért adat
    public ExtremValues minmax(){
        return new ExtremValues(minimum(),maximum());
    }

}
