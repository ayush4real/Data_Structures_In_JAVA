package ArraynLinkedLists;

import java.util.LinkedList;

public class ImplementDequeueUsingLL {
    int size;
    LinkedList<Integer> list;

    public ImplementDequeueUsingLL(int capacity){
        list=new LinkedList<>();
        this.size=capacity;
    }

    public void insertFront(int data){
        if(list.size()==this.size){
            System.out.println(-1);
            return;
        }
        list.addFirst(data);
    }

    public void insertRear(int data){
        if(list.size()==this.size){
            System.out.println(-1);
            return;
        }
        list.addLast(data);
    }

    public void deleteFront(){
        if (list.isEmpty()){
            System.out.println(-1);
            return;
        }
        list.removeFirst();
    }

    public void deleteRear(){
        if(list.isEmpty()){
            System.out.println(-1);
            return;
        }
        list.removeLast();
    }

    public int getRear(){
        if(list.isEmpty()){
            return -1;
        }
        return list.getLast();
    }

    public int getFront(){
        if(list.isEmpty()){
            return -1;
        }
        return list.getFirst();
    }
}
