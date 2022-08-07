package Stack;

import ArraynLinkedLists.Node;

public class StackUsingLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

//    Constructor not actually needed
    public StackUsingLinkedList(){
        head=null;
        size=0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void push(T e){
        if(head==null){
            head=new Node<>(e);
//            tail=head;
        }else{
//            insertion at the end makes time complexity for
//            pop O(n).
//            So insert at head and update the head.
//            tail.next=new Node<>(e);
//            tail=tail.next;

//            Insertion at head;
            Node<T> newN=new Node<>(e);
            newN.next=head;
            head=newN;
        }
        size++;
    }

    public T top() throws StackEmptyException{
        if(head==null){
            throw new StackEmptyException();
        }
//        for insertion at end.
//        return tail.data;

//        for insertion at head.
        return head.data;
    }

    public T pop() throws StackEmptyException{
        if(head==null){
            throw new StackEmptyException();
        }
//        Below Code when insertion is made to the
//        end of the list.
//        Node<T> temp=head;
//        Node<T> prev=head;
//        while(temp.next!=null){
//            prev=temp;
//            temp=temp.next;
//        }
//        T val=temp.data;
//        prev.next=null;
//        tail=prev;
//        size--;
//        return val;
        T val=head.data;
        head=head.next;
        size--;
        return val;
    }
}
