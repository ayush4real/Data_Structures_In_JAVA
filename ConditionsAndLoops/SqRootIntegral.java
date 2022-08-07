package ConditionsAndLoops;

import java.util.Scanner;

public class SqRootIntegral {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int i=0;
        if(n==0){
            System.out.println(0);
            return;
        }
        while(i*i<n){
            i++;
        }
        if(i*i==n){
            System.out.println(i);
        }else{
            System.out.println(i-1);
        }
    }
}
