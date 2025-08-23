package Recursion;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 121;
        System.out.println(recursiveRev(number, 0));
        System.out.println(isPalindrome(number));
    }

    public static int recursiveRev(int n, int ans){
        if(n == 0) return ans;

        ans = ans * 10 + n % 10;
        return recursiveRev(n / 10, ans); // tail recursion last function call
    }

    public static boolean isPalindrome(int n){
        int ans = 0;
//        return helperPalindrome(n, n, ans);
        return n == recursiveRev(n , 0);
    }

    public static boolean helperPalindrome(int n, int copyN, int ans){
        if(n == 0) return copyN == ans;
        ans = ans * 10 + n % 10;
        return helperPalindrome(n/10, copyN, ans);
    }

    public static int reverseNumberItr(int n){
        int ans = 0;
        while(n > 0){
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        return ans;
    }
}
