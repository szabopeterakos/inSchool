package controlselection.month;

public class DayInMonth {

    public int numberOfDays(int year, String monthHUN) { // hány napos a hónap

        // 31, 28, 29, 30
        int correctNumber;
        switch (monthHUN.toUpperCase()) {
            case "JANUÁR":
            case "MÁRCIUS":
            case "MÁJUS":
            case "JÚLIUS":
            case "AUGUSZTUS":
            case "OKTÓBER":
            case "DECEMBER":
                correctNumber = 31;
                break;
            case "ÁPRILIS":
            case "JÚNIUS":
            case "SZEPTEMBER":
            case "NOVEMBER":
                correctNumber = 30;
                break;
            case "FEBRUÁR":
                correctNumber = ((year % 4 == 0 && !(year % 100 == 0)) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0))?29:28;
                break;
            default:
                throw new IllegalArgumentException("Invalid month: " + monthHUN);

        }
        return correctNumber;
    }

    public static void main(String[] args) {
        DayInMonth dim = new DayInMonth();
        System.out.println(dim.numberOfDays(212,"február")); // 2000i, 2100n, 2012i, 2010n
    }


}
