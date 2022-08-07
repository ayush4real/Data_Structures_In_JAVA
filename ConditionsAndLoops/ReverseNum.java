package ConditionsAndLoops;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rev=0;
        for (int i = 1; n>0 ; i++) {
            rev= rev *10+ n%10;
            n=n/10;
        }
        System.out.println(rev);
    }
}
