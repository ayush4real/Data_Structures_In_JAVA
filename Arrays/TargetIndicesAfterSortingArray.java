package Arrays;

import java.util.ArrayList;
import java.util.List;

public class TargetIndicesAfterSortingArray {
    public static List<Integer> targetIndices(int[] nums, int target) {
        quickSort(nums,0,nums.length-1);
        ArrayList arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr.add(i);
            }
        }
        return arr;
    }

    public static void quickSort(int[] arr,int s, int e){
        if(s>=e){
            return;
        }
        int index=partition(arr,s,e);
        quickSort(arr,s,index-1);
        quickSort(arr,index+1,e);
    }

    public static int partition(int[] arr, int s, int e){
        int p=(s+e)/2;
        int count=0;
        for(int i=s;i<=e;i++){
            if(arr[i]<arr[p]){
                count++;
            }
        }
        int index=s+count;
        int temp=arr[p];
        arr[p]=arr[index];
        arr[index]=temp;

        int i=s,j=e;
        while(i<j){
            if(arr[i]<arr[index]){
                i++;
            }
            else if(arr[j]>=arr[index]){
                j--;
            }else{
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
        int[] nums={1,2,5,2,3};
        int target=2;
        List<Integer> indices = targetIndices(nums,target);
        for(int i=0;i<indices.size();i++){
            System.out.println(indices.get(i));
        }
    }
}
