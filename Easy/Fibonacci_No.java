//Question No: 509
package Easy;

public class Fibonacci_No {
    public int fib(int n) {
        return n > 1 ? fib(n-1) + fib(n-2) : n;
    }
}
