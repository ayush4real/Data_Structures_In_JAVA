package Queue;

public class QueueUsingStacksUse {
    public static void main(String[] args) throws QueueIsEmptyException {
        QueueUsingStacks<Integer> queue = new QueueUsingStacks<>();
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(5);
        System.out.println(queue.front());
    }
}
