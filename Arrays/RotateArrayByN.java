package Arrays;

public class RotateArrayByN {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d=0;
        int[] arr2= new int[d];
        int currIndex=-1;
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[i];
        }
        for(int i=0;i+d<arr.length;i++){
            arr[i]=arr[i+d];
            currIndex=i;
        }
        for (int i=0;i<arr2.length;i++){
            currIndex+=1;
            arr[currIndex]=arr2[i];
        }

        for(int a=0;a<arr.length;a++){
            System.out.print(arr[a]+" ");
        }
    }
}
