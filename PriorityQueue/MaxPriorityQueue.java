package PriorityQueue;

import java.util.ArrayList;

public class MaxPriorityQueue<T> {
    private ArrayList<Element<T>> heap;

    public MaxPriorityQueue(){
        heap=new ArrayList<>();
    }

    public void insert(T value, int priority){
        Element<T> e=new Element<>(value,priority);
        heap.add(e);
        int childIndex=heap.size()-1;
        int parentIndex=(childIndex-1)/2;
        while(childIndex!=0 && heap.get(parentIndex).priority<heap.get(childIndex).priority){
            if(heap.get(childIndex).priority>heap.get(parentIndex).priority){
                Element<T> temp=heap.get(childIndex);
                heap.set(childIndex,heap.get(parentIndex));
                heap.set(parentIndex,temp);
                childIndex=parentIndex;
                parentIndex=(childIndex-1)/2;
            }
        }
    }

    public int size(){
        return heap.size();
    }

    public boolean isEmpty(){
        return heap.size()==0;
    }

    public T getMax() throws PriorityQueueException {
        if(isEmpty()){
            throw new PriorityQueueException();
        }
        return heap.get(0).value;
    }

    public T removeMax() throws PriorityQueueException{
        if(heap.isEmpty()){
            throw new PriorityQueueException();
        }
        Element<T> maxEl =heap.get(0);
        Element<T> minEl=heap.get(heap.size()-1);
        heap.set(0,minEl);
        heap.remove(heap.size()-1);
        if(heap.isEmpty()){
            return maxEl.value;
        }
        int parentIdx=0;
        int childIdx1=(2*parentIdx)+1;
        int childIdx2=(2*parentIdx)+2;
        while(childIdx1<heap.size()){
            int maxIndex=parentIdx;
            if(heap.get(childIdx1).priority>heap.get(parentIdx).priority){
                maxIndex=childIdx1;
            }
            if(childIdx2<heap.size() && heap.get(childIdx2).priority>heap.get(maxIndex).priority){
                maxIndex=childIdx2;
            }
            if(maxIndex==parentIdx){
                break;
            }
            Element<T> temp=heap.get(maxIndex);
            heap.set(maxIndex,heap.get(parentIdx));
            heap.set(parentIdx,temp);
            parentIdx=maxIndex;
            childIdx1=(2*parentIdx)+1;
            childIdx2=(2*parentIdx)+2;
        }
        return maxEl.value;
    }
}
