package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int target = 6;
        System.out.println(bs(arr, target,0, arr.length - 1));
    }

    public static int bs(int[] arr, int target, int s, int e){
        // base case
        if(s > e) return -1;

        int mid = (s + e) / 2;
        if(arr[mid] == target) return mid;

        if(arr[mid] < target){
            return bs(arr, target,mid + 1, e);
        }else{
            return bs(arr, target, s,mid - 1);
        }
    }
}
