package Queue;

public class QueueLLUse {
    public static void main(String[] args) throws QueueIsEmptyException {
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.front());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.front());
        System.out.println(queue.size());
        queue.enqueue(5);
        System.out.println(queue.size());
        System.out.println(queue.front());
    }
}
