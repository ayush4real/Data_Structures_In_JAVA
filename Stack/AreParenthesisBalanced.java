package Stack;

import java.util.Stack;

public class AreParenthesisBalanced {

    public static boolean areParenthesisBalanced(String s){
        Stack<Character> stack=new Stack<>();
        for(char e: s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(e);
            }
            else if(stack.peek()=='(' && e==')' || stack.peek()=='{' && e=='}' || stack.peek()=='[' && e==']') {
                stack.pop();
            }else{
                stack.push(e);
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(areParenthesisBalanced(")()()("));
    }
}
