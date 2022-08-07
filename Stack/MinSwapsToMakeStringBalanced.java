package Stack;

import java.util.Stack;

public class MinSwapsToMakeStringBalanced {
//    String is of even length
//    [ - len/2, ] - len/2

//    t-O(n) s-O(n);
    public int minSwaps1(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='['){
                stack.push(c);
            }else{
                if(!stack.isEmpty() && stack.peek()=='['){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        int unbalanced=stack.size()/2;
        return (unbalanced+1)/2;
    }

    public int minSwaps2(String s) {
        int open=0,close=0;
        for(char c: s.toCharArray()){
            if(c=='['){
                open++;
            }else{
                if(open>0){
                    open--;
                }else{
                    close++;
                }
            }
        }
        int unbalanced=(open+close)/2;
        return (unbalanced+1)/2;
    }

    public int minSwaps3(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='['){
                stack.push(c);
            }else {
                if(!stack.isEmpty() && stack.peek()=='['){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        int n=stack.size();
        int swap=0;
        while(n>0){
            swap++;
            n-=4;
        }
        return swap;
    }

    public int minSwaps(String s) {
        int open=0,close=0,unbalanced=0;
        for(char c: s.toCharArray()){
            if(c=='['){
                open++;
            }else{
                if(open>close){
                    close++;
                }else {
                    unbalanced++;
                }
            }
        }
        return (unbalanced+1)/2;
    }

    public static void main(String[] args) {
        String s="]]][[[";
    }
}
