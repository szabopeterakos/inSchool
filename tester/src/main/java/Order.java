public class Order {

    private void name(){
        System.out.println("tomi");
    }

    private static int COUNT = 0;
    static {
        System.out.println(COUNT);
    }
    static{
        COUNT += 10;
        System.out.println(COUNT);
    }

    public Order(){
        System.out.println("constructor");
    }



    // 0, 10,tomi, const
}
