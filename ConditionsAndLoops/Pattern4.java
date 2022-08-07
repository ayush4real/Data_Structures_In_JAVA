package ConditionsAndLoops;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(1);
        int i=1;
        while(i<n){
            int j=1;
            while(j<=i+1){
                if(j==1 || j==i+1){
                    System.out.print(i);
                }else {
                    System.out.print(0);
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
