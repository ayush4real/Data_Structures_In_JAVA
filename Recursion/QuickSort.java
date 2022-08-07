package Recursion;

public class QuickSort {

    public static void quickSort(int[] input){
        quickSort(input,0,input.length-1);
    }
    public static void quickSort(int[] input, int s, int e){
        if(s>=e){
            return;
        }
        int index=partition(input, s, e);
        quickSort(input,s,index-1);
        quickSort(input,index+1,e);
    }

    public static int partition(int[] arr,int s, int e){
        int count=0;
        int pivot=(s+e)/2;
        for(int i=s;i<pivot;i++){
            if(arr[i]<arr[pivot]){
                count++;
            }
        }
        for(int i=pivot+1;i<=e;i++){
            if(arr[i]<arr[pivot]){
                count++;
            }
        }
        int index=s+count;
        int temp =arr[index];
        arr[index]=arr[pivot];
        arr[pivot]=temp;
        int i=s,j=e;
        while(i<j){
            if(arr[i]<arr[index]){
                i++;
            }else if(arr[j]>=arr[index]){
                j--;
            }else {
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
                i++;
                j--;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,2,1};
        quickSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
