package genericsusage;

public class Test {
    public int todayMethod(String str) {
        String s1 = str.toLowerCase();
        int c1 = 1;
        int c2 = 1;

        for (int i = 0; i < s1.length() - 1; i++) {
            if (s1.charAt(i) == s1.charAt(i + 1)) {
                c2++;
            }else{
                if (c2 > c1) {
                    c1 = c2;

                }
                c2 = 1;
            }
        }

        if(c2>c1){
            return c2;
        }

        return c1;
    }

    public static void main(String[] args) {
        String str = "ffffffsssssffffffff";

        Test test = new Test();
        System.out.println(test.todayMethod(str));

    }
}
