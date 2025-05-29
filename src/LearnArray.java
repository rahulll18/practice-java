import java.util.Scanner;

public class LearnArray {
    public static void main(String[] args) {
        // Static Memory Allocation
        int[] numbers = {2 , 3 , 4 , 5};

        // char array
        char[] vowels = {'a' , 'e' , 'i' , 'o' , 'u'};   // initialization and declaration

        // Scanner class to take inputs
        Scanner input = new Scanner(System.in);

        // Dynamic memory allocation at run time
        String[] names = new String[4];   // default values will be null

        // Taking input in for loop
        for(int i = 0 ; i < names.length ; i++){
            names[i] = input.nextLine();
        }

        //  Looping with for each and Printing
        for(String name: names){
            System.out.print(name + " ");
        }

        // Reading or Accessing values at particular position
        System.out.println(names[2]);

        // updating values at particular index
        names[2] = "Rahul";

    }
}
