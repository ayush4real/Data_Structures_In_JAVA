package ConditionsAndLoops;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int num=2*i-1;
            while(j<=n){
                if(num<=2*n-1){
                    System.out.print(num);
                    num+=2;
                }else if(num>2*n-1){
                    num=1;
                    System.out.print(num);
                    num+=2;
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
