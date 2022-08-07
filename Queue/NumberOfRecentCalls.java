package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
    public NumberOfRecentCalls() {

    }

    public int ping(int t) {
        Queue<Integer> queue=new LinkedList<>();
        int min=t-3000;
        queue.add(t);
        while(queue.peek()<min){
            queue.remove();
        }
        return queue.size();
    }
}
