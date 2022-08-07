package ConditionsAndLoops;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int dec = 0;
        int base =1;
        while(n>0){
            dec+=(n%10)*base;
            n=n/10;
            base*=2;
        }
        System.out.println(dec);
    }
}
