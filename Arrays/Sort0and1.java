package Arrays;

public class Sort0and1 {
    public static void swapAlt(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==1){
                while(arr[j]==1){
                    j--;
                }
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1 ,1 ,0 ,0 ,1 ,0 };
        swapAlt(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
