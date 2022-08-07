package ConditionsAndLoops;

import java.util.Scanner;

public class ArmstrongNumCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n==0 || n==1){
            System.out.println(true);
            return;
        }
        int temp =n, temp2=n;
        int sum=0, ct=0;
        while(temp>0){
            temp=temp/10;
            ct++;
        }
        while(n>0){
            int a=n%10;
            int j=1;
            int p=1;
            while(j<=ct){
                p=p*a;
                j++;
            }
            sum+=p;
            n=n/10;
        }
        if(sum==temp2){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
