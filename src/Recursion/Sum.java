package Recursion;

public class Sum {
    public static void main(String[] args) {
        int ans = sum2(5);
        System.out.println(ans);
    }

    // 1st Way
    public static int sum(int n){
        if(n == 1) return n;
        return n + sum(n - 1);  // Linear Recursion Calculation + Function Call
    }

    // 2nd Way
    public static int sum2(int n){
        return helperSum(n, 0);
    }

    public static int helperSum(int n, int ans){
        if(n == 0) return ans;
        ans = ans + n;
        return helperSum(n-1, ans);  // tail Recursion
    }
}
