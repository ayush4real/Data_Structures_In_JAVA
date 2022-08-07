package Recursion;

public class RecursionArraySortCheck {
    public static boolean checkSorted(int[] arr, int s){
        if(s==arr.length-1){
            return true;
        }
        if(arr[s]>arr[s+1]){
            return false;
        }
        return checkSorted(arr,s+1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,3};
        boolean isSorted=checkSorted(arr, 0);
        System.out.println(isSorted);
    }
}
