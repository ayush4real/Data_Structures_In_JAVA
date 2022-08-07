package Recursion;

import java.util.Scanner;

public class RecursionCountZeros {
    public static int countZerosRec(int input){
        if(input==0){
            return 1;
        }
        int count=0;
        if(input%10==0){
            count++;
        }
        if(input/10!=0){
            return count+countZerosRec(input/10);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(countZerosRec(n));
    }
}
