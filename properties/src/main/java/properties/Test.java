package properties;

public class Test {

    public int toDayMatehod(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("not allowed : " + num);
        }
        String st = Integer.toString(num);
        int sum = 0;
        for (int i = 0; i < st.length(); i++) {

            //sum += Integer.parseInt(st.substring(i,i+1));  // substring stinget ad vissza.
            //sum += Integer.parseInt(String.valueOf(st.charAt(i)));
            sum += Integer.parseInt(Character.toString(st.charAt(i)));

        }
        return sum;
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.toDayMatehod(123));

        char c = 'k';
        String str = Character.toString(c);
    }

}
