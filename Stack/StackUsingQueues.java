package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues<T> {
    private Queue<T> q1;
    private Queue<T> q2;

    public StackUsingQueues(){
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }

    public int size(){
        return q1.size();
    }

    public boolean isEmpty(){
        return q1.isEmpty();
    }

    public void push(T e){
        q1.add(e);
    }

    public T pop() throws StackEmptyException{
        if(q1.isEmpty()){
            throw new StackEmptyException();
        }
        while(q1.size()!=1){
            q2.add(q1.peek());
            q1.remove();
        }
        T val= q1.remove();
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
//        Queue<T> temp=q1;
//        q1=q2;
//        q2=temp;
        return val;
    }

    public T top() throws StackEmptyException {
        if(q1.isEmpty()){
            throw new StackEmptyException();
        }
        while(q1.size()!=1){
            q2.add(q1.peek());
            q1.remove();
        }
        T val= q1.peek();
        q1.remove();
        q2.add(val);
        Queue<T> temp=q1;
        q1=q2;
        q2=temp;
        return val;
    }
}
