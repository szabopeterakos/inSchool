package attributes.person.bill;

public class BillMain {

    public void sum(Number i , Number j){
        System.out.println(i.toString()+j.toString());
    };

    public static void main(String[] args) {
        // osztáyl  enum, interfész mind referencia tipus a jvm kezdőértéket ad.
        // a referenciát irányítjuk. amikor értéket adunk neki .
        // meddig él egy objektum?
        // private vag yprotected a konstruktor akkor nem ahsználhato.


        BillMain bm = new BillMain();
        bm.sum(10,32.654);
        System.out.println();

    }
}
