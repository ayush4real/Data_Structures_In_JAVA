package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseStringBetweenEachPairOfParentheses {
    public static String reverseParentheses(String s) {
        Deque<Character> stack=new ArrayDeque<>();

        for(char c: s.toCharArray()){
            if(c==')'){
                StringBuilder str=new StringBuilder();
                while(!stack.isEmpty() && stack.peek()!='('){
                    str.append(stack.pop());
                }
                stack.pop();
                for(int i=0;i<str.length();i++){
                    stack.push(str.charAt(i));
                }
            }else{
                stack.push(c);
            }
        }
        StringBuilder str=new StringBuilder();
        while (!stack.isEmpty()){
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        String s="b(ed(et(oc))el)a";
        System.out.println(reverseParentheses(s));
    }
}
