package Recursion;

public class LinerSearch {
    public static void main(String[] args) {
        int[] arr= {2 , 1, 4, 6};
        int target = 99;
        System.out.println(linearSearch(arr, target));
    }

    public static int linearSearch(int[] arr, int target){
        return linearSearchHelper(arr, target, 0);
    }

    public static int linearSearchHelper(int[] arr, int target, int i){
        if(i == arr.length) return -1;

        if(arr[i] == target) return i;

        return linearSearchHelper(arr, target, i+1);
    }
}
