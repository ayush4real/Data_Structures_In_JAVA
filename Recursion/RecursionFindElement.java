package Recursion;

public class RecursionFindElement {
    public static boolean checkNumber(int input[], int x){
        if(input[0]!=x && input.length==1){
            return false;
        }
        if(input[0]==x){
            return true;
        }
        int arr[]=new int[input.length-1];
        for(int i=1;i<input.length;i++){
            arr[i-1]=input[i];
        }
        return checkNumber(arr,x);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        boolean isPresent = checkNumber(arr, 4);
        System.out.println(isPresent);
    }
}
