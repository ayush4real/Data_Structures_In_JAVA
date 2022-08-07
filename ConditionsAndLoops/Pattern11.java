package ConditionsAndLoops;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n==0){
            System.out.println('*');
            System.out.print('*');
            return;
        }
        int i = 1;
        while(i<=n+1){
            int j=1;
            while(j<=2*i-1){
                if(j==2*i-1 || j==1){
                    System.out.print('*');
                }else{
                    if (j<=i){
                        System.out.print(j-1);
                    } else if (j>i) {
                        System.out.print(2*i-j-1);
                    }
                }
                j++;
            }
            System.out.println();
            i++;
        }
        int k=n;
        while(k>=0){
            int j=1;
            while(j<=(2*k)-1){
                if(j==1 || j==(2*k)-1){
                    System.out.print('*');
                }else {
                    if(j<=k){
                        System.out.print(j-1);
                    } else if (j>k) {
                        System.out.print(2*k-j-1);
                    }
                }
                j++;
            }
            System.out.println();
            k--;
        }
    }
}
