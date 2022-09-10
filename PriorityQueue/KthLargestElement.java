package PriorityQueue;

import java.util.PriorityQueue;

public class KthLargestElement {

    public static int kthLargest(int n, int[] input, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(input[i]);
        }
        for(int i=k;i<n;i++){
            if(!pq.isEmpty() && pq.peek()<input[i]){
                pq.remove();
                pq.add(input[i]);
            }
        }
        while(k>1){
            pq.remove();
            k--;
        }
        return pq.remove();
    }

    public static void main(String[] args) {

    }
}
