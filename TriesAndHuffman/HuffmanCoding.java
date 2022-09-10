package TriesAndHuffman;

import PriorityQueue.PriorityQueueException;
import PriorityQueue.Priority_Queue;

import java.util.BitSet;
import java.util.HashMap;

public class HuffmanCoding {

//    public HashMap<Character, BitSet> printHuffmanCode(HuffManNode root, int index, BitSet bits){
//        HashMap<Character, BitSet> hmCodes=new HashMap<>();
//        BitSet set=new BitSet();
//
//
//    }

    public static void main(String[] args) throws PriorityQueueException {
        String s="abadg";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c: s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        MinHeap_Huffman<Character> pq=new MinHeap_Huffman<>();
        for(char c: hm.keySet()){
            HuffManNode node=new HuffManNode(c,hm.get(c));
            pq.insert(node);
        }

        HuffManNode rootNode=null;
        while (pq.size()>1){
            HuffManNode left=pq.removeMin();
            HuffManNode right=pq.removeMin();

            HuffManNode newNode=new HuffManNode('-', left.freq+ right.freq);
            newNode.left=left;
            newNode.right=right;
            rootNode=newNode;
            pq.insert(newNode);
        }

    }
}
