package ConditionsAndLoops;

import java.util.Scanner;

public class APTerms {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        int count = 1;
        while(count <= n && i>0){
            if((3*i+2)%4==0){
                i++;
                continue;
            }else {
                System.out.print(3*i+2+" ");
                count++;
                i++;
            }
        }
    }
}
