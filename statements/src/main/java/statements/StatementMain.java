package statements;

public class StatementMain {
    public static void main(String[] args) {
        int x = 5 + 6;
        int y = 11 - x;
        int z = 8;

        boolean b = (x > y) ? true : false;
        boolean c = (b == true || z > 5) ? true : false;

        z++;

        System.out.println("boolean b "+b);
        System.out.println("boolean c "+c);
        System.out.println("z növelve egyel 8-ról "+z);

    }
}
