package Stack;

import java.util.Stack;

public class FinalPricesWithSpecialDiscount {

    public static int[] finalPrices(int[] prices){
        int n= prices.length;
        int[] arr=new int[n];
        arr[n-1]=prices[n-1];
        Stack<Integer> stack=new Stack<>();
        stack.push(prices[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()>prices[i]){
                stack.pop();
            }

            if(stack.empty()){
                arr[i]=prices[i];
            }else{
                arr[i]=prices[i]-stack.peek();
            }
            stack.push(prices[i]);
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
