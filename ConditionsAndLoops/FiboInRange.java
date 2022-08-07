package ConditionsAndLoops;

import java.util.Scanner;

public class FiboInRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int a = 0;
        int b = 1;
        for(int i=0;i<=num;i++){
            if(i==0){
                System.out.print(a+" ");
            } else if (i == 1) {
                System.out.print(b+" ");
            }else {
                int temp = b;
                b=a+b;
                a=temp;
                System.out.print(b+" ");
            }
        }

    }
}
