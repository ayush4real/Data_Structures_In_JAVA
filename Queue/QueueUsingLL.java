package Queue;

import ArraynLinkedLists.Node;

public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public QueueUsingLL(){
        front=null;
        rear=null;
        size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public T front() throws QueueIsEmptyException {
        if(front==null){
            throw new QueueIsEmptyException();
        }
        return front.data;
    }

    public void enqueue(T e){
        Node<T> newN=new Node<>(e);
        if(front==null){
            front=newN;
        }else{
            rear.next=newN;
        }
        rear=newN;
        size++;
    }

    public T dequeue() throws QueueIsEmptyException{
        if(front==null){
            throw new QueueIsEmptyException();
        }
        T val=front.data;
        front=front.next;
        size--;
        if(size==0){
            rear=null;
        }
        return val;
    }
}
