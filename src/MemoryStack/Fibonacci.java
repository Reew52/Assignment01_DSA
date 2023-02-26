package MemoryStack;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int n = 6;
        int fib = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is " + fib);
    }
}
