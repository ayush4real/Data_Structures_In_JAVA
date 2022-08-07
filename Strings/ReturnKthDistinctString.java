package Strings;

import java.util.Arrays;

public class ReturnKthDistinctString {

    public static String kthDistinct(String[] arr, int k) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            boolean uni=true;
            for(int j=0;j<i;j++){
                if(arr[i].equals(arr[j])) uni=false;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])) uni=false;
            }
            if(uni) count++;
            if(count==k) return arr[i];
        }
        return "";
    }

    public static void main(String[] args) {
        String[] arr={"d","b","c","b","c","a"};
        int k=2;
        System.out.println(kthDistinct(arr,k));
    }
}
