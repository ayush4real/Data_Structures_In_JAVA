package ConditionsAndLoops;

import java.util.Scanner;

public class SumProductInRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int choice = s.nextInt();
        int total=0;
        int product =1;
        if(choice==1){
            for(int i=1;i<=num;i++){
                total+=i;
            }
            System.out.println(total);
        }else if (choice==2){
            for (int i = 1; i <=num ; i++) {
                product*=i;
            }
            System.out.println(product);
        }else {
            System.out.println(-1);
        }
    }
}
