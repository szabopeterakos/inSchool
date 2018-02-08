package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Snow ";
        String message = prefix + name;
        message = message + 444;

        boolean b = message.equals("Hello John Snow ");
        boolean c = message.equals("Hello John Snow 444");

        String w1 = "";
        String w2 = "";
        String wAll = w1 + w2;

        String word01 = "Abcde";

        System.out.println(c);
        System.out.println(wAll.length()+" hosszú a két üres string concat");

        System.out.println(word01.length()+word01.indexOf(0)+" "+word01.indexOf(2)+"\nrészlet belőlre:\n"+word01.substring(0,2));

        System.out.println("john" +4+4); // már stringkét kezeli
        System.out.println(4+4+"john"); // először számokkén kezeli aminek az eredményét irja ki stringként

    }
}
