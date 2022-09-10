package TriesAndHuffman;

import PriorityQueue.PriorityQueueException;

import java.util.ArrayList;

public class MinHeap_Huffman<T> {
    private ArrayList<HuffManNode> heap;

    public MinHeap_Huffman(){
        heap=new ArrayList<>();
    }

    public void insert(HuffManNode e){
        heap.add(e);
        int childIndex=heap.size()-1;
        int parentIndex=(childIndex-1)/2;
        while(childIndex!=0 && heap.get(parentIndex).freq>heap.get(childIndex).freq){
            if(heap.get(childIndex).freq<heap.get(parentIndex).freq){
                HuffManNode temp=heap.get(childIndex);
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

    public HuffManNode getMin() throws PriorityQueueException {
        if(isEmpty()){
            throw new PriorityQueueException();
        }
        return heap.get(0);
    }

    public HuffManNode removeMin() throws PriorityQueueException{
        if(heap.isEmpty()){
            throw new PriorityQueueException();
        }
        HuffManNode minEl =heap.get(0);
        HuffManNode maxEl=heap.get(heap.size()-1);
        heap.set(0,maxEl);
        heap.remove(heap.size()-1);
        if(heap.isEmpty()){
            return minEl;
        }
        int parentIdx=0;
        int childIdx1=(2*parentIdx)+1;
        int childIdx2=(2*parentIdx)+2;
        while(childIdx1<heap.size()){
            int minIndex=parentIdx;
            if(heap.get(childIdx1).freq<heap.get(parentIdx).freq){
                minIndex=childIdx1;
            }
            if(childIdx2<heap.size() && heap.get(childIdx2).freq<heap.get(minIndex).freq){
                minIndex=childIdx2;
            }
            if(minIndex==parentIdx){
                break;
            }
            HuffManNode temp=heap.get(minIndex);
            heap.set(minIndex,heap.get(parentIdx));
            heap.set(parentIdx,temp);
            parentIdx=minIndex;
            childIdx1=(2*parentIdx)+1;
            childIdx2=(2*parentIdx)+2;
        }
        return minEl;
    }
}
