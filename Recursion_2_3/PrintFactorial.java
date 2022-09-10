package Recursion_2_3;

public class PrintFactorial {

    public static void printFactorial(int n, int ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        ans=ans*n;
        printFactorial(n-1,ans);
    }

    public static void main(String[] args) {
        int n=5;
        printFactorial(n,1) ;
    }
}
