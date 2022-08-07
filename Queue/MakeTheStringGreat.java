package Queue;

import java.util.Stack;

public class MakeTheStringGreat {

    public static String makeGoodAlt2(String s){
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(sb.length()>0 && Math.abs(sb.charAt(sb.length()-1)-s.charAt(i))==32){
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String makeGoodAlt1(String s){
        if(s.length()<=1){
            return s;
        }
        String str=makeGoodAlt1(    s.substring(1));
        if(str.length()==0){
            return s.charAt(0)+"";
        }
        if((str.charAt(0)-32)==s.charAt(0) || (str.charAt(0)+32)==s.charAt(0)){
            return str.substring(1);
        }else{
            return s.charAt(0)+str;
        }
    }

    public static String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                if((stack.peek()+32)==c || (stack.peek()-32)==c){
                    stack.pop();
                }
                else {
                    stack.push(c);
                }
            }
        }
        StringBuilder str= new StringBuilder();
        while(!stack.isEmpty()){
            str.insert(0, stack.pop());
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s="abcCBD";
        System.out.println(makeGoodAlt2(s));
    }
}
