package ConditionsAndLoops;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
//        while(i<=n){
//            int j=1;
//            int spaces =1;
//            int stars=1;
//            while(spaces<=n-i){
//                System.out.print('-');
//                spaces++;
//            }
//            while(stars<=i){
//                System.out.print('*');
//                stars++;
//            }
//            System.out.println();
//            i++;
//        }
        while(i<=n){
            int j=1;
            while(j<=n){
                if(j<=n-i){
                    System.out.print('-');
                }else {
                    System.out.print('*');
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
