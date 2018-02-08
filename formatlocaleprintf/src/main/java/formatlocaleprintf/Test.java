package formatlocaleprintf;

public class Test {

    // https://alvinalexander.com/programming/printf-format-cheat-sheet

    public static void main(String[] args) {
        System.out.printf("the %s jumped over the %s, %d times", "cow", "moon", 2);
        System.out.println();
        System.out.format("the %s jumped over the %s, %d times", "cow", "moon", 2);
        System.out.println();
        System.out.println();

        String result = String.format("the %s jumped over the %s, %d times", "cow", "moon", 2);
        System.out.println(result);
        System.err.format("the %s jumped over the %s, %d times \n", "cow", "moon", 2);

    }
}
