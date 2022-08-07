package Stack;

import java.util.Stack;

public class MinimumBracketReversals {

    public static int countBracketReversals(String input) {
        Stack<Character> stack=new Stack<>();
        if(input.length()==2){
            if(input.charAt(0)=='{' && input.charAt(1)=='}'){
                return 0;
            }
            if(input.charAt(0)=='}' && input.charAt(1)=='{'){
                return 2;
            }
        }
        int count=0;
        for(char c: input.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                if(stack.peek()=='{' && c=='}'){
                    stack.pop();
                }else{
                    stack.push(c);
                }
//                if(stack.peek()=='{' && c=='{'){
//                    count++;
//                    stack.pop();
//                }
//                else if(stack.peek()=='}' && c=='}'){
//                    count++;
//                    stack.pop();
//                }
//                else if(stack.peek()=='{' && c=='}'){
//                    stack.pop();
//                }
//                else{
//                    stack.push(c);
//                }
            }
        }
        while(stack.size()>1){
            char c=stack.pop();
            if(stack.peek()=='{' && c=='{'){
                count++;
                stack.pop();
            }
            else if(stack.peek()=='}' && c=='}'){
                count++;
                stack.pop();
            }
            else{
                stack.pop();
                count+=2;
            }
        }
        if(!stack.isEmpty()){
            return -1;
        }else{
            return count;
        }
    }

    public static void main(String[] args) {
        System.out.println(countBracketReversals("{{{{}}"));
    }
}
