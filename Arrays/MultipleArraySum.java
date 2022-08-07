package Arrays;

import java.util.Scanner;

public class MultipleArraySum {
    public static void swapAlt(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean unique = true;
            int j=0;
            while(j<i){
                if(arr[i]==arr[j]){
                    unique=false;
                }
                j++;
            }
            int k=i+1;
            while(k<arr.length){
                if(arr[k]==arr[j]){
                    unique=false;
                }
                k++;
            }
            if(unique){
                System.out.println(arr[i]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,3,4,3,2,1};
        swapAlt(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
