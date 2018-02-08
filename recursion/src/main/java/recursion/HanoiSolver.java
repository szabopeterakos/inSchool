package recursion;

public class HanoiSolver {

    String result = "";

    public void moveDisks(int n, char start, char end, char to) {
        if (n == 1) {

            result += start + "->" + end;
        } else {
            moveDisks(n - 1, start, to, end);
            result += start + "->" + end;
            moveDisks(n - 1, to, end, start);
        }
    }

    String getResultOfGame(){
        return this.result;
    }

}
