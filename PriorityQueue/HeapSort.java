package PriorityQueue;

public class HeapSort {

    public static void downHeapify(int[] arr,int i,int n){
        int parentIndex=i;
        int leftChildIdx=2*i+1;
        int rightChildIdx=2*i+2;

        while(leftChildIdx<n){
            int minIndex=parentIndex;
            if(arr[leftChildIdx]<arr[minIndex]){
                minIndex=leftChildIdx;
            }
            if(rightChildIdx<n && arr[rightChildIdx]<arr[minIndex]){
                minIndex=rightChildIdx;
            }

            if(minIndex==parentIndex){
                return;
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[parentIndex];
            arr[parentIndex]=temp;
            parentIndex=minIndex;
            leftChildIdx=(2*parentIndex)+1;
            rightChildIdx=(2*parentIndex)+2;
        }
    }

    public static void heapSort(int[] arr){
        if(arr.length<=1){
            return;
        }
        int n=arr.length;
        for(int i=(n/2)-1;i>=0;i--){
            downHeapify(arr,i,n);
        }

        for(int i=n-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            downHeapify(arr,0,i);
        }
    }

    public static void main(String[] args) {
        int[] arr={4,7,3,2,8,9,6,1};
        heapSort(arr);
        for(int i: arr){
            System.out.println(i);
        }
    }
}
