package staticExample;

public class staticInit {
    static int a = 4;
    static int b;

    // If you want to initialize the static variable in that case you can use static block
    // this block will only run once
    static {
        System.out.println("Static block will loaded when the first time class is loaded");
        b = a * 3;   // b = 12
    }

    public static void main(String[] args) {
        System.out.println(a + " " + b);
    }
}
