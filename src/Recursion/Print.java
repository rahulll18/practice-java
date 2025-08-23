package Recursion;

public class Print {
    public static void main(String[] args) {

        // print n to 1
        // iterative
        for(int i = 5; i >= 1; i--) System.out.println(i);

        // recursive
        printNto1(5);

        // print 1 to n
        for(int i = 1; i <= 5; i++) System.out.println(i);
        // recursive
        print1ToN(5);
    }

    // print n to 1
    public static void printNto1(int n){
        if(n == 0)  return;

        System.out.println(n);   // First Printing and then Calling Recursive Function
        printNto1(n - 1);
    }

    public static void print1ToN(int n){
        if(n == 0) return;

        // first calling and then printing
        print1ToN(n - 1);  // 5 4 3 2 1
        System.out.println(n);
    }
}
