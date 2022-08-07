package ConditionsAndLoops;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int num1=i;
            int num2=2*i-2;
            while(j<=n-i){
                System.out.print(' ');
                j++;
            }
            while(num1<=(2*i)-1){
                System.out.print(num1);
                num1++;
            }
            while (num2>=i){
                System.out.print(num2);
                num2--;
            }
            System.out.println();
            i++;
        }
    }
}
