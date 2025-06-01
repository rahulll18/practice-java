import java.util.Scanner;

public class JavaLoop {
    public static void main(String[] args) {
        Scanner stringInput = new Scanner(System.in);

        System.out.println("Enter String");
        String str = stringInput.next();

        System.out.println("My Input String :- " + str);

        // for loop
        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);  // reading char at each index
            System.out.println(ch);
        }

        // while loop
        int index = 0;
        while(index < str.length()){
            System.out.println(str.charAt(index));
            index++;
        }

        // Extracting some part from the string. Using substring built-in function
        System.out.println(str.substring(1 , 3));
    }
}
