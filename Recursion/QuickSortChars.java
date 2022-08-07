package Recursion;

public class QuickSortChars {
    public static void quickSort(char[] input, int s, int e){
        if(s>=e){
            return;
        }
        int index=partition(input, s, e);
        quickSort(input,s,index-1);
        quickSort(input,index+1,e);
    }

    public static int partition(char[] arr,int s, int e){
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
        char temp =arr[index];
        arr[index]=arr[pivot];
        arr[pivot]=temp;
        int i=s,j=e;
        while(i<j){
            if(arr[i]<arr[index]){
                i++;
            }else if(arr[j]>=arr[index]){
                j--;
            }else {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        char[] arr={'a','e','g','d','b','c','f','h'};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
