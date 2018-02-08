package recursion;

public class nfactore {

    public int nFactSum(int n) {
        int sum = 1;
        if (n > 1) {
            sum = n * nFactSum(n - 1);
        }
        return sum;

    }

    public int recSUM(int n){
        int sum = 0;
        if(n > 0){ sum = n + recSUM(n-1); }
        return sum;
    }


    public static void main(String[] args) {
        nfactore nf = new nfactore();

        System.out.println(nf.nFactSum(4)); // 24
        System.out.println(nf.recSUM(4)); // 10

    }

}

