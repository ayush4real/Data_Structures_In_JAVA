package ConditionsAndLoops;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= (n / 2) + 1) {
            int j = 1;
            while (j <= (n / 2 + 1) - i) {
                System.out.print(' ');
                j++;
            }
            int num1 = 1;
            while (num1 <= 2 * i - 1) {
                System.out.print('*');
                num1++;
            }
            System.out.println();
            i++;
        }
        while (i<=n){
            int j=1;
            while(j<=(i-(n/2+1))){
                System.out.print(' ');
                j++;
            }
            int num2 =1;
            while(num2<=(n-i)*2+1){
                System.out.print('*');
                num2++;
            }
            System.out.println();
            i++;
        }
    }
}
