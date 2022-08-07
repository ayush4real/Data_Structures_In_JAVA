package Arrays;

public class PushZerosToEndOptimised {
    public static void main(String[] args) {
        int[] arr = {9,0,0,8,2};
        int j=0,i=0;
        while(i<arr.length){
            if(arr[i]!=0){
                if(i!=j){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                i++;
                j++;
            } else if (arr[i]==0) {
                i++;
            }
        }

        for(int a=0;a<arr.length;a++){
            System.out.print(arr[a]+" ");
        }
    }
}
