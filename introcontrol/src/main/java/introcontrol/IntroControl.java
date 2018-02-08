package introcontrol;

public class IntroControl {
    public int substractTenIfGreaterThanTen(int n) {
        if (n <= 10) {
            return n;
        } else {
            return n - 10;
        }
    }

    public String describeNumber(int n) {
        String temp;
        switch (n) {
            case 0:
                temp = "this is zero";
                break;
            case 1:
                temp = "this is ONE not zero";
                break;
            default:
                temp = "not zero or one";
        }
        return temp;
    }

    public String greetingToJoe(String name) {
        if (name.equals("Joe")) {
            return "Hello" + name;
        } else {
            return "";
        }
    }

    public int calculateBonus(int i) {
        double temp;
        if (i >= 1_000_000) {
            temp = i * 0.1;
        } else {
            temp = 0;
        }
        return (int) temp;
    }

    public String calculateMeterReadingsDifference(int prev, int next) {
        int temp;
        if (prev < next) {
            temp = next - prev;
        } else if (prev > next) {
            temp = (10000 - prev) + next;
        } else {
            temp = -1;
        }

        if (temp == -1) {
            return "sajna nincs mit fizetni";
        } else {
            return temp + " a mérőállás közti különbség";
        }
    }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.print(i + " ");
        }
    }

    public void printNumbersBetween(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
    }

    public void printNumbersBetweenAnyDirection(int min, int max) {
        if (min < max) {
            for (int i = min; i < max; i++) {
                System.out.print(i + " ");
            }
        } else if (min > max) {
            for (int ii = min; ii > max; ii--) {
                //System.out.println("kacsa");
                System.out.print(ii + " ");
            }
        }
    }

    public void printOddNumbers(int max){
        for (int i = 1; i <= max ; i++){
            if(!(i % 2 == 0)){
                System.out.print(i+ " ");
            }
        }
    }


    public static void main(String[] args) {
        IntroControl xx = new IntroControl();
        System.out.println(xx.substractTenIfGreaterThanTen(11));
        System.out.println(xx.substractTenIfGreaterThanTen(99));
        System.out.println(xx.substractTenIfGreaterThanTen(10));
        System.out.println(xx.substractTenIfGreaterThanTen(1));
        System.out.println(xx.describeNumber(0));
        System.out.println(xx.describeNumber(1));
        System.out.println(xx.describeNumber(2));
        System.out.println(xx.greetingToJoe("Joe"));
        System.out.println(xx.greetingToJoe("Joey"));
        System.out.println(xx.calculateBonus(1_000_000));
        System.out.println(xx.calculateMeterReadingsDifference(88, 1234));
        System.out.println(xx.calculateMeterReadingsDifference(9000, 1));
        System.out.println(xx.calculateMeterReadingsDifference(9000, 9000));
        xx.printNumbers(10);
        System.out.println("\ntól-ig: ");
        xx.printNumbersBetween(10, 20);
        System.out.println("\nelőre sor : ");
        xx.printNumbersBetweenAnyDirection(10, 20);
        System.out.println("\nvissza sor :");
        xx.printNumbersBetweenAnyDirection(20, 10);
        System.out.println("\npáratlan számok :");
        xx.printOddNumbers(33);
        System.out.println("\nmitörténik ha negatív érték megy be? :");
        //xx.printOddNumbers(-32); // semmi nem jön vissza
        //System.out.println(xx.calculateBonus(33.32)); nem ok a típusa
        //xx.printNumbersBetween(32,11); nem ok

    }
}
