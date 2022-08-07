package Strings;

import java.util.Arrays;

public class GenerateStringWithOddCountChars {

    public static String generateTheString(int n) {
        if(n==1){
            return "a";
        }
        if(n==2){
            return "ab";
        }
        char[] arr=new char[n];
        if(n%2!=0){
            Arrays.fill(arr,'a');
        }else{
            Arrays.fill(arr,0,1,'a');
            Arrays.fill(arr,1,n,'b');
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        int n=6;
        System.out.println(generateTheString(n));
    }
}
