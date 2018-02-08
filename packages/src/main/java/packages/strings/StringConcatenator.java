package packages.strings;

public class StringConcatenator {
    public String concatenate(String a, String b) {
        return a.concat(b);
    }

    public static void main(String[] args) {
        StringConcatenator sc = new StringConcatenator();
        String temp = sc.concatenate("tomika", " pofija");
        System.out.println(temp);
    }

}
