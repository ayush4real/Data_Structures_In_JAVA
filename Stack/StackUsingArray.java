package Stack;

public class StackUsingArray {
    private int[] data;
    private int top;

    public StackUsingArray(){
        data=new int[2];
        top=-1;
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public int top() throws StackEmptyException{
        if(top==-1){
            throw new StackEmptyException();
        }
        return data[top];
    }

    public void push(int e) throws StackFullException{
        if(top== data.length-1){
//            StackFullException ex=new StackFullException();
//            throw ex;
//            throw new StackFullException();
            doubleCapacity();
        }
        data[++top]=e;
    }

    private void doubleCapacity(){
        int temp[]=data;
        data=new int[2*temp.length];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }

    public int pop() throws StackEmptyException{
        if(top==-1){
            throw new StackEmptyException();
        }
        return data[top--];
    }
}
