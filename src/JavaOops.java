class CarClass{

    // properties or state of class
    public String carName;
    public int price;
    public int literCapacity;

    // Constructor Defined
    // Constructor Function Invoked after Object Creation
    // Constructor Used to Initialise the Value
    // Constructor does not have return type
    CarClass(){
        this.carName = "Ferrari";
        this.price = 500000;
        this.literCapacity = 10;
    }
}

public class JavaOops {
    public static void main(String[] args) {
       // Instance of Car Class
        // Object of Car Class
        // Object have its instance variable and methods

        CarClass carObj = new CarClass();
        System.out.println(carObj.carName); // accessing value from object
    }
}
