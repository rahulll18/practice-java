class Student{
    public String name;
    public int rollNo;
    public int marks;


    // copying constructor from the another constructor
    Student(){
        // calling parameter constructor
        this("Default Stu Name" , 22 , 55);
    }

    // parameter constructor
    Student(String name , int rollNo , int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

public class CallAnotherConstructor {
    public static void main(String[] args) {
        //Creating instance of the student class
        Student rahul = new Student();
        System.out.println(rahul.name); // Default Stu Name

        Student david = new Student("David Warner" , 44 , 88);
        System.out.println(david.name); // David Warner
    }
}
