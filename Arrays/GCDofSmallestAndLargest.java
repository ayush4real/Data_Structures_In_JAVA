package Arrays;

import java.util.Arrays;

public class GCDofSmallestAndLargest {

    public static int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=min){
                min=nums[i];
            }
            if(nums[i]>=max){
                max=nums[i];
            }
        }
//        System.out.println(min+" "+max);
        int val=0;
        for(int i=min;i>=0;i--){
            if(max%i==0 && min%i==0){
                val=i;
                break;
            }
        }
        return val;
    }

    public static void main(String[] args) {
        int[] arr={7,5,6,8,3};
        System.out.println(findGCD(arr));
    }
}
