import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Integer> fibonacciSequence() {
        List<Integer> fibonacciSequence = new ArrayList<>();
        int n0 = 0;
        int n1 = 1;
        fibonacciSequence.add(n0);
        fibonacciSequence.add(n1);
        for (int i = 0; i < 45; i++) {
            Integer n2 = n0 + n1;
            fibonacciSequence.add(n2);
            n0 = n1;
            n1 = n2;
        }
        return fibonacciSequence;
    }

    public static String fibonacciNumberExist(Integer n) {
        int n0 = 0;
        int n1 = 1;
        while (n1 <= n) {
            int n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        if (n == n0) {
            return "The number " + n + " is in the Fibonacci Sequence";
        } else {
            return "The number " + n + " isn't the Fibonacci Sequence";
        }
    }

    public static String fibonacciPosition(Integer n) {
        if (n > 45) {
            return "The number " + n + "  exceeds the program limit";
        }
        List<Integer> fibonacciSequence = new ArrayList<>();
        int n0 = 0;
        int n1 = 1;
        fibonacciSequence.add(n0);
        fibonacciSequence.add(n1);
        for (int i = 0; i < n; i++) {
            int n2 = n0 + n1;
            fibonacciSequence.add(n2);
            n0 = n1;
            n1 = n2;
        }
        return "The position " + n + " in the Fibonacci Sequence has the number " + fibonacciSequence.get(n);
    }

    public static List<Integer> fibonacciWithLimit(Integer limit) {
        if (limit > 45) {
            return null;
        }
        List<Integer> fibonacciSequence = new ArrayList<>();
        int n0 = 0;
        int n1 = 1;
        fibonacciSequence.add(n0);
        fibonacciSequence.add(n1);
        for (int i = 2; i < limit+1; i++) {
            int n2 = n0 + n1;
            fibonacciSequence.add(n2);
            n0 = n1;
            n1 = n2;
        }
        return fibonacciSequence;
    }
}
