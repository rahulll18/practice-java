package Recursion;

public class SumDigit {
    public static void main(String[] args) {
        int ans = productDigit(12);
        System.out.println(ans);
    }

    public static int sumDigit(int n){
        if(n == 0) return 0;
        return n % 10 + sumDigit(n / 10);   // linear recursion ( Calculation + Function Call )
    }

    public static int productDigit(int n){
        if(n == 0) return 1;
        return n % 10 * sumDigit(n / 10);   // linear recursion ( Calculation + Function Call )
    }

    public static int iterativeSumDigit(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
