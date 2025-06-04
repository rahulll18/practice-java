public class FinalKeyword {
    public static void main(String[] args) {
        // final keyword
        // Not able to modify the value of the variable , Value will be constant across whole code execution
        // final variables have to be declared & initialized simultaneously

        final float PI = 3.14f;
        //  PERCENTAGE = 85;  Can't do this , Java won't allow

        System.out.println(PI);

        final StudentExample stu = new StudentExample("Shyam" , 99);
        // You can modify value for the object , but can't assign new obj;

        // example
        stu.name = "Rahul";
        System.out.println(stu.name);  // name changed "Shyam" to "Rahul"

        // stu = new StudentExample("Aniket" , 85);  // Can't assign because of the final keyword to stu obj

        // Finalized method to do something before object is being to destroy
    }
}

class StudentExample{
    public String name;
    public int rollNo;

    StudentExample(String name , int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
}
