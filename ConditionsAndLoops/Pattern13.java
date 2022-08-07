package ConditionsAndLoops;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            int j=1;
            int num=1;
            sum+=i;
            while (j<=2*i+1){
               if(j<=2*i-1){
                   if(j%2==0){
                       System.out.print('+');
                   }else {
                       System.out.print(num);
                       num++;
                   }
               } else if (j==2*i) {
                    System.out.print('=');
               }else {
                   System.out.print(sum);
               }
               j++;
            }
            System.out.println();
            i++;
        }
    }
}
