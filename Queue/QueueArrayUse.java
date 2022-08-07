package Queue;

public class QueueArrayUse {
    public static void main(String[] args) throws QueueIsEmptyException,QueueIsFullException {
        QueueUsingArray queue=new QueueUsingArray();
        System.out.println(queue.size());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.enqueue(50);
        System.out.println(queue.dequeue());
//        System.out.println(queue.size());
//        System.out.println(queue.front());
//        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
//        System.out.println(queue.front());
        queue.enqueue(15);
        queue.enqueue(25);
        queue.enqueue(35);
        System.out.println(queue.front());
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());

    }
}
