package ConditionsAndLoops;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=n){
            int k=1;
            while(k<=i-1){
                System.out.print(' ');
                k++;
            }
            int j=n;
            while(j>=1){
                System.out.print('*');
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
