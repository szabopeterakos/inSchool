package classStructure;

public class megegy {
    public static void main(String[] args) {
        int i = 2;
        int temp = (i < 1) ? 11 : 22; // három operandus cuccli;

        System.out.println(temp);

        String str = "";
        String str02 = "tomassmann";
        String str03 = "tomassmann";
        System.out.println(str.length());
        System.out.println(str02.indexOf("n"));
        System.out.println(str03);

        String a = "lacc";
        String b = "lacci";
        String c = "lacc";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        // / / FONTOS / / //

        String xx = new String("alma");
        String yy = new String("alma");

        System.out.println(xx==yy); // referencia helyet;
        System.out.println(xx.equals(yy)); // tartalmat hasonlít össze Stringnél más esetben
        // ÉN IS Írhatok meg akkor én adom meg a szempontot is !!!;


        // stringek különböző helyet foglalnak el aszeritn hogy hogyan készültek.
    }



}
