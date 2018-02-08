package controlselection.greetings;

public class Greetings {

    public String greet(int hour, int minute){
        String message;

        if (hour > 5 && hour < 9) message= "jó reggelt";
        else if (hour ==5 && minute > 0) message= "jó reggelt";
        else if ( hour == 9 && minute == 0) message= "jó reggelt";

        else if ( hour == 9 && minute > 0) message= "jó napot";
        else if ( hour >9 && hour < 18) message= "jó napot";
        else if ( hour == 18 && minute <= 30) message= "jó napot";

        else if ( hour == 18 && minute > 30) message= "jó estét";
        else if ( hour > 18 && hour < 20) message= "jó estét";
        else if ( hour == 20 && minute == 0) message= "jó estét";

        else if ( hour == 20 && minute > 0) message= "jó éjt";
        else if ( hour > 20 && hour <=24) message= "jó éjt";
        else if ( hour >=0 && hour < 5) message= "jó éjt";
        else if ( hour ==5 && minute == 0) message= "jó éjt";

        else if (hour > 24 || minute > 59) message= "rossz megadott érték";
        else return "";

        return message;
    }

    public static void main(String[] args) {
        Greetings g = new Greetings();
        System.out.println(g.greet(4,30));      // ejt
        System.out.println(g.greet(5,0));       // ejt
        System.out.println(g.greet(5,1));       // reg
        System.out.println(g.greet(9,0));       // reg
        System.out.println(g.greet(9,1));       // nap
        System.out.println(g.greet(18,30));     // nap
        System.out.println(g.greet(18,31));     // est

    }

}
