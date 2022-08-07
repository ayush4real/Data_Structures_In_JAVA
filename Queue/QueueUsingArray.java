package Queue;

public class QueueUsingArray {
    private int[] data;
    private  int front;
    private int rear;
    private int size;

    public QueueUsingArray(){
        data=new int[3];
        front=-1;
        rear=-1;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int front() throws QueueIsEmptyException {
        if(size==0){
            throw new QueueIsEmptyException();
        }
        return data[front];
    }

    public void enqueue(int e) throws QueueIsFullException {
        if(size==data.length){
//            throw new QueueIsFullException();
            doubleCapacity();
        }
        if(size==0){
            front++;
        }
//        rear++;
//        if(rear==data.length){
//            rear=0;
//        }
//        replacing above lines with modulo operator
        rear=(rear+1) % data.length; // rear will always range from 0 to data.length-1;

        data[rear]=e;
        size++;
    }

    private void doubleCapacity(){
        int[] temp=data;
        data=new int[2*temp.length];
        int i=0;
        while(size!=0){
            if(front==temp.length){
                front=0;
            }
            data[i]=temp[front];
            front++;
            i++;
            size--;
        }
        front=0;
        rear=i-1;
        size=i;
    }

    public int dequeue() throws QueueIsEmptyException{
        if(size==0){
            throw new QueueIsEmptyException();
        }
        int val=data[front];
//        front++;
//        if(front==data.length){
//            front=0;
//        }
        front=(front+1) % data.length;
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return val;
    }
}
