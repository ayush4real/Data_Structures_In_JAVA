package Recursion;

public class RecursionGeometricSum {

    public static double geometricSum(int n){
        if(n==0){
            return 1;
        }
        return (((1/Math.pow(2,n))+geometricSum(n-1))*100000)/100000.0;
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(geometricSum(n));
    }
}
