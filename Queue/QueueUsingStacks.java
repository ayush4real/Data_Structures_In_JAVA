package Queue;

import java.util.Stack;

public class QueueUsingStacks<T> {
    private Stack<T> s1;
    private Stack<T> s2;

    public QueueUsingStacks(){
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public int size(){
        return s1.size();
    }

    public boolean isEmpty(){
        return s1.isEmpty();
    }

    public void enqueue(T e){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(e);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public T front() throws QueueIsEmptyException {
        if(s1.isEmpty()){
            throw new QueueIsEmptyException();
        }
        return s1.peek();
    }


    public T dequeue() throws QueueIsEmptyException{
        if(s1.isEmpty()){
            throw new QueueIsEmptyException();
        }
        return s1.pop();
    }
}
