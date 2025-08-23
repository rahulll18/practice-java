package Recursion;

public class ArraySorted {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8};
        System.out.println(sortedOrNot(arr, 0));
        System.out.println(sortedOrNotHelper(arr, 1));
    }

    // 1st Way
    public static boolean sortedOrNot(int[] arr, int index){
        if(index == arr.length - 1) return true;
        return arr[index] <= arr[index + 1] && sortedOrNot(arr, index + 1);
    }

    // 2nd Way
    public static boolean sortedOrNotHelper(int[] arr, int index){
        if(index == arr.length) return true;

        if(arr[index - 1] > arr[index]) return false;
        return sortedOrNotHelper(arr, index + 1);
    }
}
