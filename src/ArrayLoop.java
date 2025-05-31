import java.util.Arrays;

public class ArrayLoop {
    public static void main(String[] args) {

        // For Loop and For Each;
        // when to use
        // For Loop : When You want to modified given array
        // For Each : When you want to read only array

        int[] numbers = { 2 , 4 , 6 , 8 };

        for(int i = 0 ; i < numbers.length ; i++){
            numbers[i] *= 2;
        }

        System.out.println(Arrays.toString(numbers)); //  [4, 8, 12, 16]

        for(int number: numbers){
            number *= 2;  // this will change only for local variable
        }

        System.out.println(Arrays.toString(numbers));
    }
}
