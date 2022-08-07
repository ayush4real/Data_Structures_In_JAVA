package Recursion;

public class RecursionSumOfDigits {
    public static int sumOfDigits(int input){
        if(input==0){
            return 0;
        }
        return (input%10) + sumOfDigits(input/10);
    }

    public static void main(String[] args) {
        int n=-123;
        System.out.println(sumOfDigits(n));
    }
}
