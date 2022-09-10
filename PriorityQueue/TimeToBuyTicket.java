package PriorityQueue;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class TimeToBuyTicket {

    public static int buyTicket(int[] input, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        Deque<Integer> queue=new LinkedList<>();
        for(int i=0;i<input.length;i++){
            queue.add(i);
        }
        for(int i:input){
            pq.add(i);
        }
        int count=0;
        while(!queue.isEmpty()){
            if(input[queue.peek()]<pq.peek()){
                queue.add(queue.remove());
            }else{
                pq.remove();
                int val=queue.remove();
                count++;
                if(val==k){
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={3,9,4};
        System.out.println(buyTicket(arr,2));
    }
}
