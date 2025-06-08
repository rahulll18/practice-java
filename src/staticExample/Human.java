package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean isHeOrSheMarried;

    // You can use static variables without creating an object by Human.population
    // Static variables and class belongs to the class not to the object
    static long population;

    Human(int age ,String name , int salary , boolean isHeOrSheMarried ){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isHeOrSheMarried = isHeOrSheMarried;

        // Accessing Static method using Human. convention
        Human.population +=1;
        Human.displayHumanFromStatic();
    }

    // declared static method , which is not-dependent on object instance
    static void displayHumanFromStatic(){
        //  displayHuman(); non-static method cannot be accessed inside static context , because it requires reference

        // If you want to use non-static method inside static context , then you have to make reference
        Human hu =  new Human(55 , "hu" , 555 , true);
        hu.displayHuman();   // you can access non-static method by creating reference
    }

    // declared non-static method , which is dependent on object instance
    void displayHuman(){
        System.out.println(this.name + " " + this.salary);
    }

    public static void main(String[] args) {
        displayHumanFromStatic();
    }
}
