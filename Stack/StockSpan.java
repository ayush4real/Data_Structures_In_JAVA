package Stack;

import java.util.Stack;

public class StockSpan {

    public static int[] stockSpan(int[] price) {
        int[] span=new int[price.length];
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        for(int e: price){
            s1.push(e);
        }
        int l=price.length-1;
        while(!s1.isEmpty()){
            int n= s1.pop();
            int count=1;
            while(!s1.isEmpty() && s1.peek()<n){
                s2.push(s1.pop());
                count++;
            }
            span[l]=count;
            l--;
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        return span;
    }

    public static void main(String[] args) {
        int[] arr={10,10,10,10};
        int[] span=stockSpan(arr);
        for(int e: span){
            System.out.print(e+" ");
        }
    }
}
