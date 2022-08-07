package ConditionsAndLoops;

import java.util.Scanner;

public class NumInFiboSeq {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=0,b=1;
        boolean inFib=false;
//        for(int i=0;a<=n;i++){
//            if(a==n){
//                inFib=true;
//                break;
//            }
//            int temp=b;
//            b=a+b;
//            a=temp;
//        }
//        if(inFib){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }
        while(a<=n){
            if(a==n){
                inFib=true;
                break;
            }
            int temp=b;
            b=a+b;
            a=temp;
        }
        if(inFib){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
