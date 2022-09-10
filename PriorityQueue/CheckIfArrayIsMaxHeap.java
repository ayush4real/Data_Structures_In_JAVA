package PriorityQueue;

public class CheckIfArrayIsMaxHeap {

    public static boolean checkMaxHeap(int arr[]) {
        for(int i=0;i<arr.length;i++){
            if(2*i+1<arr.length){
                if(arr[2*i+1]>arr[i]){
                    return false;
                }
            }
            if(2*i+2<arr.length){
                if(arr[2*i+2]>arr[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
