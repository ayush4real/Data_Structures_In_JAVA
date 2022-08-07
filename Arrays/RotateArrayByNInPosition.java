package Arrays;

public class RotateArrayByNInPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d=2;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=0;
        j=arr.length-d-1;
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=arr.length-d;
        j=arr.length-1;
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for(int a=0;a<arr.length;a++){
            System.out.print(arr[a]+" ");
        }
    }
}
