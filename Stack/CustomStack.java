package Stack;

import java.util.Stack;

public class CustomStack {
//    int maxSize;
//    Stack<Integer> stack;
    int[] data;
    int top;

    public CustomStack(int maxSize) {
//        this.maxSize=maxSize;
//        stack=new Stack<>();
        data=new int[maxSize];
        top=-1;
    }

    public void push(int x) {
//        if(stack.size()==maxSize){
//            return;
//        }
//        stack.push(x);
        if(top== data.length-1){
            return;
        }
        data[++top]=x;
    }

    public int pop() {
//        if(stack.isEmpty()){
//            return -1;
//        }
//        return stack.pop();
        if(top==-1){
            return -1;
        }
        return data[top--];
    }

    public void increment(int k, int val) {
        if(top== -1){
            return;
        }
        int i=0;
        while(i<k && i<=top){
            data[i]+=val;
            i++;
        }
//        if(stack.isEmpty()){
//            return;
//        }
//        Stack<Integer> s2=new Stack<>();
//        while(!stack.isEmpty()){
//            s2.push(stack.pop());
//        }
//        while(k>0 && !s2.isEmpty()){
//            stack.push(val+s2.pop());
//            k--;
//        }
//        while(!s2.isEmpty()){
//            stack.push(s2.pop());
//        }
    }
}
