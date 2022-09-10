package PriorityQueue;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class FirstKLargestElements {

    public static ArrayList<Integer> kLargest(int input[], int k){
        ArrayList<Integer> list=new ArrayList<>();
        if(input.length==k){
            for (int j : input) {
                list.add(0, j);
            }
            return list;
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(input[i]);
        }
        for(int j=k;j<input.length;j++){
            if(!pq.isEmpty() && pq.peek()<input[j]){
                pq.remove();
                pq.add(input[j]);
            }
        }
        while(!pq.isEmpty()){
            list.add(0,pq.remove());
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr={5,2,9,6,8,7,4,11,1,10,3};
        ArrayList<Integer> list=kLargest(arr,4);
        for(int i:list){
            System.out.println(i);
        }
    }
}
