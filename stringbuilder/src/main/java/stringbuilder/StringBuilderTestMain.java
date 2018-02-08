package stringbuilder;

public class StringBuilderTestMain {



    public static void main(String[] args) {
        String x = "owgrfipsjdlg";
        StringBuilder test = new StringBuilder("hello") ;
        test.append(" " + x);
        test.insert(test.indexOf("fip"),"www");
        test.deleteCharAt(0);
        test.reverse();
        System.out.println(test);
        System.out.println("");
    }

}
