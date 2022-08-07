package ConditionsAndLoops;

import java.util.Scanner;

public class NumReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int a = 0;
        while(num>0){
            a = a * 10 + (num % 10);
            num /= 10;
        }
        System.out.println(a);
    }
}
