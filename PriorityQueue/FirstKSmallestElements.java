package PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class FirstKSmallestElements {

    public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(input[i]);
            if(pq.size()>k){
                pq.remove();
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(0,pq.poll());
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
