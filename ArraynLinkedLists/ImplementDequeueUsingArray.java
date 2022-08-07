package ArraynLinkedLists;

public class ImplementDequeueUsingArray {
    int size;
    int arr[];
    int front;
    int rear;

    public ImplementDequeueUsingArray(int capacity){
        arr=new int[capacity];
        this.size=capacity;
        this.rear=0;
        this.front=-1;
    }

    public boolean isFull(){
        return (this.rear==0 && this.front==size-1) || (this.rear+1==this.front);
    }

    public boolean isEmpty(){
        return this.front==-1;
    }

    public void insertFront(int data){
        if(this.isFull()){
            System.out.println(-1);
            return;
        }
        if(front==-1){
            this.front=0;
            this.rear=0;
        } else if (this.front==0) {
            front=size-1;
        }else{
            front=front-1;
        }
        arr[front]=data;
    }

    public void insertRear(int data){
        if(this.isFull()){
            System.out.println(-1);
            return;
        }
        if(this.front==-1){
            this.front=0;
            this.rear=0;
        } else if (this.rear==this.size-1) {
            this.rear=0;
        }else {
            this.rear=this.rear+1;
        }
        arr[rear]=data;
    }

    public int getFront(){
        if(this.isEmpty()){
            return -1;
        }
        return arr[this.front];
    }

    public int getRear(){
        if(this.isEmpty()){
            return -1;
        }
        return arr[this.rear];
    }

    public void deleteFront(){
        if(this.isEmpty()){
            System.out.println(-1);
            return;
        }
        if(this.front==this.rear){
            this.front=-1;
            this.rear=0;
        } else if (this.front==this.size-1) {
            this.front=-1;
        }else {
            this.front+=1;
        }
    }

    public void deleteRear(){
        if(this.isEmpty()){
            System.out.println(-1);
            return;
        }
        if(this.rear==this.front){
            this.front=-1;
            this.rear=0;
        } else if (this.rear==0) {
            this.rear=this.size-1;
        }else{
            this.rear-=1;
        }
    }
}
