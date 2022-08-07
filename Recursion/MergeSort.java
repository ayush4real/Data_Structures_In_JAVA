package Recursion;

public class MergeSort {
    public static void mergeSort(int[]arr){
        if(arr.length<=1){
            return;
        }
        int mid=(arr.length)/2;
        int arr1[]=new int[mid];
        int arr2[]=new int[arr.length-mid];
        for(int i=0;i<mid;i++){
            arr1[i]=arr[i];
        }
        mergeSort(arr1);
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[i+mid];
        }
        mergeSort(arr2);
        merge(arr,arr1,arr2);
    }

    public static void merge(int[] arr, int[] arr1, int[] arr2){
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
            }else {
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while (i<arr1.length){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr={};
        mergeSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
