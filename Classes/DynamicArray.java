package Classes;

public class DynamicArray {
    private int data[];
    private int nextIndex;

    public DynamicArray(){
        data= new int[5];
        nextIndex=0;
    }

    public int size(){
        return this.nextIndex;
    }

    public boolean isEmpty(){
        return this.nextIndex==0;
    }

    public int get(int i){
        if(i>=this.nextIndex){
            return -1;
        }
        return data[i];
    }

    public void set(int i, int ele){
        if(i>=this.nextIndex){
            return;
        }
        data[i]=ele;
    }

    public void add(int ele){
        if(this.nextIndex==this.data.length){
            doubleCapacity();
        }

        this.data[nextIndex]=ele;
        this.nextIndex++;
    }

    private void doubleCapacity() {
        int temp[] = this.data;
        this.data = new int[2*temp.length];
        for(int i=0;i<temp.length;i++){
            this.data[i]=temp[i];
        }
    }

    public int removeLast(){
        if(this.nextIndex==0){
            return -1;
        }
        int temp=data[this.nextIndex-1];
        this.nextIndex--;
        return temp;
    }
}
