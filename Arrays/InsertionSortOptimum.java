package Arrays;

public class InsertionSortOptimum {
    public static void main(String[] args) {
        int l=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        int[] arr = {2,2,2,2,2,2};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>l){
                s=l;
                l=arr[i];
            } else if (arr[i]<l && arr[i]>s) {
                s=arr[i];
            }
        }
        System.out.println(s);
    }
}
