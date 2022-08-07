package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class RemoveOutermostParentheses {

    public static String removeOuterParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
                list.add(i);
            } else if (c==')' && stack.peek()=='(') {
                stack.pop();
                if(stack.isEmpty()){
                    list.add(i);
                }
            }else{
                stack.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i< list.size();i+=2){
            sb.append(s.substring(list.get(i)+1,list.get(i+1)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
    }
}
