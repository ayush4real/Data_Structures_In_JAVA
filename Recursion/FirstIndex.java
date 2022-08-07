package Recursion;

public class FirstIndex {
    public static int s=0;
    public static int firstIndex(int input[], int x){
        if(input[s]==x){
            return s;
        }
        if(s==input.length-1){
            return -1;
        }
        s++;
        return firstIndex(input,x);
    }

    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,2};
        int index=firstIndex(arr,4);
        System.out.println(index);
    }
}
