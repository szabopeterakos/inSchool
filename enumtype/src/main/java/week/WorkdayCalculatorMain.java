package week;

public class WorkdayCalculatorMain {

    public static void main(String[] args) {
        Day c = Day.WEDNESDAY;
        int zz = c.ordinal();

        System.out.println(zz);
        System.out.println(c.getTypeOfTheDay());



        WorkdayCalculator wdc = new WorkdayCalculator();
        System.out.println(wdc.dayTypes(c,7));
    }

}
