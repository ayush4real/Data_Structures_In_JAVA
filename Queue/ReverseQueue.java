package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

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
        reverseQueue(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
