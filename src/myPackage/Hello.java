package myPackage;
import static greeting.Hello.sayHello;  // Importing static function which public access modifier from another package

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello From My Package");
        sayHello("Rahul");
    }
}
