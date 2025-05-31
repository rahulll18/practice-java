import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // String in java basically type of object which stores character in sequential manner
        // String comes under non-primitive data type
        // Where each character stores in 16 bit i.e 2 bytes
        // Strings are immutable: once created, they cannot be changed or modified

        // Scanner Class To Take input of String using next()
        Scanner inputStr = new Scanner(System.in);
        String word = inputStr.next();   // next use to take word input stops at space
        String line = inputStr.nextLine(); // next-line takes whole line as input until uh hit enter

        // declaration & initialization
        String str = "My Name is Rahul";  // static allocation. String Literal
        String name = new String("Rahul");  // Dynamic Allocation. Using new Keyword

    }
}
