package ConditionsAndLoops;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int num=1;
            while(j<=n){
                if(j<=n-i){
                    System.out.print(' ');
                }else {
                    System.out.print('*');
                }
                j++;
            }
            while(num<=i-1){
                System.out.print('*');
                num++;
            }
            System.out.println();
            i++;
        }
    }
}
