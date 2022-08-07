package Arrays;

import java.util.Arrays;

public class DivideArrayInNPairs {

    public static boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int p=0;
        for(int i=0;i<nums.length;){
            if(nums[i]!=nums[i+1]){
                return false;
            }else{
                p++;
                i+=2;
            }
        }
        return true;
    }

    public static boolean divideArrayAlt1(int[] nums){
        int[] arr=new int[501];
        int unique=0;
        for(int i=0;i<nums.length;i++){
            if(unique>nums.length/2){
                return false;
            }
            if(arr[nums[i]]==0){
                arr[nums[i]]++;
                unique++;
            }else{
                arr[nums[i]]++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={3,2,3,2,2,2,4,3};
        System.out.println(divideArrayAlt1(arr));
    }
}
