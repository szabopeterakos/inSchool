package test;

public class ArrayMain {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 22;
        System.out.println(a[0]);
        System.out.println(a[1]); // tömb alapértéket ad
        // indexhatárellenőrzés van alapvetően, ami miatt exeption jön alapból


        int[] x = {3, 2, 4, 5, 6, 6, 44, 7, 7, 7,};

        for(int i = 0; i < x.length; i++){
            System.out.print(x[i]+ " ");
        }

        //foreach vezérlő
        System.out.println("\nVALAMI");

        for(int cucc : x){
            System.out.print(cucc + " ");
        }

        String xx = new String("makika");

        System.out.println("\n"+xx.substring(0,1)+","+xx.substring(1,2));
        System.out.println("\n"+xx.substring(1,2));
    }
}
