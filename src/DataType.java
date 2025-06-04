// Demonstrating how to create a class
class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println(model + " " + year);
    }
}

public class DataType {
    public static void main(String[] args) {
        // primitive data type   ( numeric and non numeric )

        // numeric data type
        boolean bool = false;   // 1 byte , 8 bits

        char ch = 'A'; // 2 bytes , 16 bits

        // non numeric data type

        byte by = 2;   // 1 byte , 8-bit signed integer ,  range -128 to 127

        short sh = 23;  // 2 byte , 16-bit signed integer , range -32,768 to 32,767

        int i = 43434;  // 4 byte , 32-bit signed integer , range -2,147,483,648 to 2,147,483,647

        long lg = 423434343; // 8 byte , 64-bit signed integer, range -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        float f = 2.3f;    // 4 bytes

        double db = 2.3434d;     // 8 bytes

        // non-primitive data type
        // array , string , class , object , interface
        // mostly non-primitive data types are allocated dynamically ( with new keyword in the heap )

        // ARRAYS
        int[] arr = {2 ,3 , 4 , 5};
        char[] charArray = new char[3];

        // STRING
        String title = "Java Enthusiast";

        // CLASS AND OBJECT
        // I have made one class
        Car myCar = new Car("Ferrari" , 2023);

        // Interface will learn later at the time OOPS

    }
}
