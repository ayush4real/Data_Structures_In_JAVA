package Recursion;

import java.util.Scanner;

public class Recursion {

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int power(int x, int n){
        if(n==1){
            return x;
        }
        return x*power(x,n-1);
    }

    public static int count(int n){
//        int c=0;
        if(n==0){
            return 0;
        }else{
            return count(n/10)+1;
        }
    }

    public static void printNatural(int n){
        if(n==0){
            return;
        }
        printNatural(n-1);
        System.out.print(n+" ");
    }

    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void print(int n){
        if(n < 0){
            return;
        }
        if(n == 0){
            System.out.println(n);
            return;
        }
        print(--n);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
//        int n= s.nextInt();
//        int fact= factorial(n);
//        int p=power(x,n);
//        int c=count(x);
//        System.out.println(c);
//        System.out.println(p);
//        printNatural(x);
//        int fib=fibonacci(x);
//        System.out.println(fib);
        print(x);
    }
}
