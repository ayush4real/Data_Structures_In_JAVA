package Arrays;

public class Sort0and1Alt {
    public static void swapAlt(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==1){
                if(arr[j]==1){
                    j--;
                } else if (arr[j]==0) {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    i++;
                    j--;
                }
            }
            else if (arr[i]==0){
                i++;
            }
        }
    }

    public static void main(String[] args) {
//        int[] arr = {0 ,1 ,0 ,0 ,0 ,0 ,1 ,0 ,0 ,1 ,1 };
        int[] arr = {0 ,1 ,1,0,1,0,1};
        swapAlt(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
