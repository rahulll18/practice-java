package Recursion;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7 , 3 , 6, 7, 3};

        reverse(arr, 0, arr.length - 1);

       for(int e: arr) System.out.print(e + " ");
    }

    public static void reverse(int[] arr, int s, int e){
        if(s > e) return;

        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        reverse(arr, s + 1, e - 1);
    }

}
