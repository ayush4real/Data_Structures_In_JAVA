package Recursion;

public class RecursionStaircaseSteps123 {
    public static int staircase(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        int x=staircase(n-1);
        int y=staircase(n-2);
        int z=staircase(n-3);

        return x+y+z;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(staircase(n));
    }
}
