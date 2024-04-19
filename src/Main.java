import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                ----------------------------------------------------------------
                Numbers of the Fibonacci Sequence:)""");
        System.out.println(Fibonacci.fibonacciSequence());
        int tries = 0;

        do {
            tries++;
            System.out.println("""
                ----------------------------------------------------------------
                Type the "m" number you want to search for in the Fibonacci Sequence""");
            int n = scan.nextInt();
            Fibonacci.fibonacciNumberExist(n);
            System.out.println("""
                ----------------------------------------------------------------
                Type the "m" number of the position you want to search for in the Fibonacci Sequence""");
            n = scan.nextInt();
           Fibonacci.fibonacciPosition(n);
            System.out.println("""
                ----------------------------------------------------------------
                Write the "m" limit number of the Fibonacci sequence.""");
            n = scan.nextInt();
            Fibonacci.fibonacciWithLimit(n);

//            System.out.println(RussianMultiplication.operation(10,-4));
        }while (tries < 3);

    }
}