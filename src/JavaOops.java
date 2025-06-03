class CarClass{

    // properties or state of class
    public String carName;
    public int price;
    public int literCapacity;

    // Constructor Defined
    // Constructor is a special type of function that invoked after the creation of object
    // Constructor Function Invoked after Object Creation
    // Constructor Used to Initialise the Value
    // Constructor does not have return type
    CarClass(){
        this.carName = "Ferrari";
        this.price = 500000;
        this.literCapacity = 10;
    }

    //Parameterized Constructor
    CarClass(String carName , int price , int literCapacity){
        this.carName = carName;
        this.price = price;
        this.literCapacity = literCapacity;
    }
}

public class JavaOops {
    public static void main(String[] args) {
       // Instance of Car Class
        // Object of Car Class
        // Object have its instance variable and methods

        CarClass carObj = new CarClass(); // with default constructor
        System.out.println(carObj.carName); // accessing value from object

        CarClass car2obj = new CarClass("Maruti" , 5000000 , 40); // with parameters
        System.out.println(car2obj.carName);
    }
}
