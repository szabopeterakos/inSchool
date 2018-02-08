
import java.util.*;

public class Test {

    public static void main(String[] args) {
        System.out.println("ojh");

        Queue<Integer> integerQueue = new LinkedList<>(Arrays.asList(123, 432, 666, 54, 3333, 54321, 95688, 7, 98));
        Queue<Integer> integerQueue1 = new PriorityQueue<>(Arrays.asList(123, 432, 666, 54, 3333, 54321, 95688, 7, 98));

        System.out.println(integerQueue);
        //System.out.println(new TreeSet<>(integerQueue1));
        System.out.println(integerQueue.element());
        System.out.println(integerQueue.peek());

        int c = 0;
        while(integerQueue.size()!=0){
            integerQueue.poll();
            System.out.println(integerQueue.size());
            c++;

        }

        Queue<Double> doubles = new ArrayDeque<>();
        doubles.add(3.3);
        doubles.add(3.2);
        doubles.add(3.2);
        doubles.offer(4.4);
        doubles.add(1.1);

        doubles.clear();

        System.out.println(doubles.peek());

        Deque<Integer> deque = new LinkedList<>(Arrays.asList(4,5,7,7,8,9,6,3,4,7));
        System.out.println(deque);
        deque.push(333);
        System.out.println(deque);
        deque.add(222);
        System.out.println(deque);

    }


}
