package TwoDArrays;

public class IsArraySorted {

    public static boolean checkSorted(int arr[]){
        if(arr.length==1){
            return true;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        int[] arr2=new int[arr.length-1];
        for(int i=1;i< arr.length;i++){
            arr2[i-1]=arr[i];
        }
        return checkSorted(arr2);
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,4,5,6};
        boolean check=checkSorted(arr);
        System.out.println(check);
    }
}
