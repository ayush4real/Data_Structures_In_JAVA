package Stack;

import java.util.Stack;

public class CheckForRedundantBrackets {

    public static boolean checkRedundantBrackets(String expression) {
        //Your code goes here
        Stack<Character> stack=new Stack<>();
        for(char c:expression.toCharArray()){
            if(c==')'){
                int count=0;
                while(stack.peek()!='('){
                    stack.pop();
                    count++;
                }
                if(count<=1){
                    return true;
                }
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s="(a)";
        System.out.println(checkRedundantBrackets(s));
    }
}
