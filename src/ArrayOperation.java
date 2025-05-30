import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args) {
        // Insert at particular position

        int[] nums = { 3 , 12 , 5,  5 , 66};
        int position = 2;
        int valueToBeInsert = 233;

        System.out.println(Arrays.toString(insertAtPosition(nums , valueToBeInsert, position)));;  // [3, 233, 12, 5, 5]
    }

    public static int[] insertAtPosition(int[] arr , int valueToBeInsert ,int position){
        int i = arr.length - 1;

        while(i >= position){
            arr[i] = arr[i - 1];
            i--;
        }

        arr[i] = valueToBeInsert;
        return arr;
    }
}
