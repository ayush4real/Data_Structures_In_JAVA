package Arrays;

public class PairSum {
    public static void swapAlt(int[] arr, int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,7,5,1};
        int n=5;
        swapAlt(arr, n);
    }
}
