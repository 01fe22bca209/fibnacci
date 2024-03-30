/**
 * The Java class FibonacciSeries generates and prints the Fibonacci series up to a specified number of
 * terms.
 */
public class FibonacciSeries {
public static void main(String[] args) {
        int n=5;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        int firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}