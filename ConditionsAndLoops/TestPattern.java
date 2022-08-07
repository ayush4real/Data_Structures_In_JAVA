package ConditionsAndLoops;

import java.util.Scanner;

public class TestPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=0;
        while(i<n){
            int j=1;
            while(j<=n+1){
                int k=n;
                if(j<=n){
                    if(j<=n-i){
                        System.out.print(j);
                    } else if (j>n-i) {
                        System.out.print('*');
                    }
                } else if (j>n) {
                    while(k>0){
                        if(k>n-i){
                            System.out.print('*');
                        } else if (k<=n-i) {
                            System.out.print(k);
                        }
                        k--;
                    }
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
