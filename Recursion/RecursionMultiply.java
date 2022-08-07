package Recursion;

public class RecursionMultiply {
    public static int multiplyTwoIntegers(int m, int n){
        if(m==0 || n==0){
            return 0;
        }
        if(m==1){
            return n;
        }
        if(n==1){
            return m;
        }
        return m+multiplyTwoIntegers(m,n-1);
    }

    public static void main(String[] args) {
        int m=5,n=1;
        System.out.println(multiplyTwoIntegers(m,n));
    }
}
