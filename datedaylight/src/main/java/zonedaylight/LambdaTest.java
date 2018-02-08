package zonedaylight;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LambdaTest {

    public static void main(String[] args) {
        Random r = new Random();
        //System.out.println(Stream.generate(()-> r.nextInt(100)).limit(30).peek(e -> System.out.println(e)).collect(//));
        Stream.generate(() -> r.nextInt(100)).limit(30).forEach(e -> System.out.print(e + "  "));

        List<String> l = Arrays.asList("go", "go", "go", "go", "go", "go", "go", "go", "go", "go", "mo");

        l.stream().filter(s -> s.equals("mo")).findFirst().get();
        System.out.println(l.stream().filter(s -> s.equals("mo")).findFirst().get());
        //System.out.println(l.stream().filter(s->s.equals("jo")).findFirst().get());
          //
        //
          //
        //

        Integer s = new Integer(3)* new Integer(3);
        int[] n = {0, 1, 2, 3, 4 - 1, -2, -3, -4, 0};

        class SignCoounter {
            private int numOfPositive;
            private int numOfNegative;
            private int numOfZero;

            public void accumulator(int a) {
                if (a < 0) {
                    numOfNegative++;
                }
                if (a > 0) {
                    numOfPositive++;
                }
                if (a == 0) {
                    numOfZero++;
                }
            }

            public void combine(SignCoounter sc){ // mert módosítja
                this.numOfZero += sc.numOfZero;
                this.numOfPositive += sc.numOfPositive;
                this.numOfNegative += sc.numOfNegative;
            }
        }

        System.out.println(Arrays.stream(n).collect(SignCoounter::new, SignCoounter::accumulator, SignCoounter::combine).numOfNegative);

        TreeSet<String> ts;

        Arrays.stream(n).forEach(x -> System.out.println(x));

        List<String> kk = Arrays.asList("tm","wegwg","79o6iukjhz");

        //List<Integer> ii = kk.

        System.out.println("\n\n");

        IntStream integer = IntStream.range(1,6);
        IntSummaryStatistics stat = integer.summaryStatistics();
        System.out.println(stat.getMax());
        stat.getSum();
    }

}
