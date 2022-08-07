package ConditionsAndLoops;

import java.util.Scanner;

public class ZerosAndStar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n+1){
                if(j==i || j==n+1){
                    System.out.print('*');
                }else {
                    System.out.print(0);
                }
                j++;
            }
            int k=1;
            while(k<=n){
                if(k==n-i+1){
                    System.out.print('*');
                }else {
                    System.out.print(0);
                }
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
