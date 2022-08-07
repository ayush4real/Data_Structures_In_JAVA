package Stack;

import java.util.Stack;

public class MinAddToMakeParenthesesValid {

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c: s.toCharArray()){
            if(stack.peek()=='(' && c==')'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.size();
    }

    public static void main(String[] args) {

    }
}
