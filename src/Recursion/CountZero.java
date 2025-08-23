package Recursion;

public class CountZero {
    public static void main(String[] args) {
        int n = 234053200;
        int count = countZero(n);
        System.out.println(count);
    }

    public static int countZero(int n){
        return helper(n, 0);
    }

    public static int helper(int n, int count){
        if(n == 0) return count;

        if(n % 10 == 0) count++;
        return helper(n/10, count);
    }

    public static int countZeroIterative(int n){
        int count = 0;

        while(n > 0){
            if(n % 10 == 0) count++;
            n /= 10;
        }
        return count;
    }
}
