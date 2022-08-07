package ConditionsAndLoops;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int i=0;
//        while(i<n){
//            int j=1;
//            while(j<=n){
//                if(j<=n-i){
//                    System.out.print(j);
//                }else if (j>n-i){
//                    System.out.print('*');
//                }
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//        while(i<n){
//            int j=n;
//            while(j>0){
//                if(j<=n-i){
//                    System.out.print(j);
//                }else if (j>n-i){
//                    System.out.print('*');
//                }
//                j--;
//            }
//            System.out.println();
//            i++;
//        }
//        while(i<n){
//            int j=1;
//            while(j<2*n){
//                int k=n;
//                if(j<=n){
//                    if(j<=n-i){
//                        System.out.print(j);
//                    } else if (j>n-i) {
//                        System.out.print('*');
//                    }
//                } else if (j>n) {
//                    while(k>1){
//                        if(k>n-i){
//                            System.out.print('*');
//                        } else if (k<=n-i) {
//                            System.out.print(k);
//                        }
//                        k--;
//                    }
//                }
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
        int i = 1;
        while(i < 3) {
            int j = 0;
            while(j < 5) {
                j++;
                if(j == 3) {
                    continue;
                }
                System.out.print(j + " ");
            }
            i++;
        }
    }
}
