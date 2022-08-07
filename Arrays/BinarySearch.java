package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0,1,5,6,14,17,26};
        int s=0;
        int target = 14;
        int e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]>target){
                e=mid-1;
            }else if (arr[mid]<target){
                s=mid+1;
            }else {
                System.out.println(mid);
                return;
            }
        }
    }
}
