package localvariables;

public class LocalVariablesMain {
    private boolean b;
    private int a = 2;
    private  int i = 3; int j = 4;
    private int k = i;
    private String s = "Hello Girl !";
    private String t = s;

    public int cucc(){
        int x = 0;
        return x;
    }

    public static void main(String[] args) {
        LocalVariablesMain xx = new LocalVariablesMain();
        System.out.println(xx.b);
        System.out.println(xx.cucc());
    }



}
