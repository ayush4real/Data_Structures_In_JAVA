package ConditionsAndLoops;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long bin = 0;
        int c =1;
        while(n!=0){
            bin=bin+((n%2) *c ) ;
            n=n/2;
            c*=10;
        }
        System.out.println(bin);
    }
}
