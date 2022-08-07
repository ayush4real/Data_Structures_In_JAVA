package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DecodeXORedArray {
    public static void main(String[] args) {
        int[] encoded={6,2,7,3};
        int first =4;
        int arr[]=new int[encoded.length+1];

        arr[0]=first;
//        int start=1;
//        for(int i=0;i< encoded.length;i++){
//            Arrays.fill(arr,start,start+1,arr[i]^encoded[i]);
//            start++;
//        }
        for(int i=0;i< encoded.length;i++){
            arr[i+1]=arr[i]^encoded[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
