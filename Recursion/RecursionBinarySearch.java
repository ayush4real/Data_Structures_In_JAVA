package Recursion;

public class RecursionBinarySearch {
    public static int binarySearch(int[] arr, int x,int s, int e){
        if(s>e){
            return s;
        }
        int mid=(s+e)/2;
        if(arr[mid]==x){
            return mid;
        }
        if(arr[mid]<x){
            return binarySearch(arr,x,mid+1,e);
        }else {
            return binarySearch(arr,x,s,mid-1);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(binarySearch(arr,5,0,arr.length-1));
    }
}
