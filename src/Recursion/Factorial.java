package Recursion;

public class Factorial {
    public static void main(String[] args) {
       int ans = fact(5);
        System.out.println(ans);
        System.out.println(factorialTail(5 , 1));
    }

    public static int fact(int n){
        if(n <= 1) return n;
        return n * fact(n - 1);
    }

    public static int factorialTail(int n, int acc) {
        if (n == 0 || n == 1) return acc;
        return factorialTail(n - 1, n * acc);
    }
}
