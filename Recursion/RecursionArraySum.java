package Recursion;

public class RecursionArraySum {
    public static int sum(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        int[] arr2=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            arr2[i-1]=arr[i];
        }
        return arr[0]+sum(arr2);
    }

    public static void main(String[] args) {
        int[] arr={9,8,9};
        int sum=sum(arr);
        System.out.println(sum);
    }
}
