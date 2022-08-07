package ConditionsAndLoops;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                if(j<=i){
                    System.out.print(n-i+j);
                } else if (j>i) {
                    System.out.print(n+1);
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
