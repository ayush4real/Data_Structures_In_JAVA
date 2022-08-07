package Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;

public class MinRemoveToMakeValidParentheses {

    public static String minRemoveToMakeValid(String s) {
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isAlphabetic(c)){
                continue;
            }
            if (c == '(') {
                stack.push(i);
            }else {
                if(!stack.isEmpty() && s.charAt(stack.peek())=='('){
                    stack.pop();
                }else{
                    stack.push(i);
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        HashSet<Integer> set=new HashSet<>(stack);
        for(int i=0;i<s.length();i++){
            if(!set.contains(i)){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
