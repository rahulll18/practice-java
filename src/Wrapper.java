public class Wrapper {
    public static void main(String[] args) {

        // primitive variable
        int a = 12;
        int b = 24;

        // Integer Wrapper Class
        // Integer num = new Integer(45);
        Integer num = 45;

        swap(a, b);   // In java for primitive , everything is pass by value , value would not change
        System.out.println(a);  // 12
        System.out.println(b);  // 24
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped a " + a);  // 24
        System.out.println("Swapped b " + b);  // 12
    }
}
