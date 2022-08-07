package ConditionsAndLoops;

import java.util.Scanner;

public class FibLessThanEqualNum {
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));
        int n = s.nextInt();
        int a=0, b=1;
//        for(int i=0;a<=n;i++){
//            System.out.print(a+" ");
//            int temp=b;
//            b=a+b;
//            a=temp;
//        }
        while(a<=n){
            System.out.print(a+" ");
            int temp = b;
            b=a+b;
            a=temp;
        }
    }
}
