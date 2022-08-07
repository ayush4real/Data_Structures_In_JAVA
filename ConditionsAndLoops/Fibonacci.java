package ConditionsAndLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 3;
        int a = 1;
        int b = 1;
        int temp;
        if(n == 1){
            System.out.println(b);
            return;
        } else if (n == 2) {
            System.out.println(b);
            return;
        }
        else {
            while(i <= n){
                temp = b;
                b = a+b;
                a = temp;
                i++;
            }
            System.out.println(b);
        }
    }
}
