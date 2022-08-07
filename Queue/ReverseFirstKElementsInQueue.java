package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseFirstKElementsInQueue {

    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        if(k<=1){
            return input;
        }
        Queue<Integer> q1=new LinkedList<>();
        int i=k;
        while(i>0){
            q1.add(input.remove());
            i--;
        }
        reverseQueue(q1);
        while(!q1.isEmpty()){
            input.add(q1.remove());
        }
        int size=input.size();
        while(size-k>0){
            input.add(input.remove());
            size--;
        }
        return input;
    }

    public static void reverseQueue(Queue<Integer> input) {
        if(input.size()==1){
            return;
        }
        int val=input.remove();
        reverseQueue(input);
        input.add(val);
    }

    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        reverseKElements(queue,9);
        System.out.print(queue.remove()+" ");
        System.out.print(queue.remove()+" ");
        System.out.print(queue.remove()+" ");
        System.out.print(queue.remove()+" ");
        System.out.print(queue.remove()+" ");
        System.out.print(queue.remove()+" ");
        System.out.print(queue.remove()+" ");
        System.out.print(queue.remove()+" ");
        System.out.print(queue.remove()+" ");
    }
}
