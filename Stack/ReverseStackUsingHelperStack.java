package Stack;

import java.util.Stack;

public class ReverseStackUsingHelperStack {

    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra){
        int i=input.size();
        while(i>0){
            int n=input.pop();
            int j=1;
            while(j<i){
                extra.push(input.pop());
                j++;
            }
            input.push(n);
            while(!extra.isEmpty()){
                input.push(extra.pop());
            }
            i--;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        s1.push(5);
        s1.push(6);
        s1.push(7);
        s1.push(1);
        s1.push(9);
//        while(!s1.isEmpty()){
//            System.out.print(s1.pop()+" ");
//        }
        reverseStack(s1,s2);
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
}
