package Recursion;

public class Recursion {
    public static void main(String[] args) {
        // Fibbo
        System.out.println(fibbo(5));
    }

    public static int fibbo(int n){
        // Base Condition When to Stop
        if(n <= 1) return n;

        return fibbo(n - 1) + fibbo(n - 2);   // Recurrence Relation
    }
}
