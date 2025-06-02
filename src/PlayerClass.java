// 'OOPS' stands for Object-Oriented Programming System.
// It is a programming approach that organizes code into objects and classes and makes it more structured and easy to manage.
// A class is a blueprint that defines properties and behaviors

public class PlayerClass {
    // Properties OR States Of Class
    private String name;
    private String country;
    private int age;
    private int totalInternationalRuns;

    // setter function to set a player Details
    public void setPlayerDetails(String name , String country , int age , int totalInternationalRuns){
        this.name = name;
        this.country = country;
        this.age = age;
        this.totalInternationalRuns = totalInternationalRuns;
    }

    // function to display playerDetails
    public void displayPlayerDetails(){
        System.out.println("Player Name is :- " + this.name);
        System.out.println("Country Name is :- " + this.country);
        System.out.println("Player age is :- " + this.age);
        System.out.println("Total Internation Runs :- " + this.totalInternationalRuns);
    }

    // getter function to get internation runs
    public int getInterNationlRuns(){
        return this.totalInternationalRuns;
    }

    public static void main(String[] args) {
        PlayerClass Dhoni = new PlayerClass();
        Dhoni.setPlayerDetails("Mahendra Singh Dhoni" , "India" , 43 , 100000);

        // Display Dhoni Details;
        Dhoni.displayPlayerDetails();
    }
}
