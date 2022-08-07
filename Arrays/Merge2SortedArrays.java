package Arrays;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3,4};
        int[] arr2 = {5,6,7,8,9,10,11,12};
        int n= arr1.length+arr2.length;
        int[] arr3 = new int[n];
        int i=0,j=0,k=0;
        while(i< arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
            }else{
                arr3[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        for(int a=0;a<arr3.length;a++){
            System.out.print(arr3[a]+" ");
        }
    }
}
