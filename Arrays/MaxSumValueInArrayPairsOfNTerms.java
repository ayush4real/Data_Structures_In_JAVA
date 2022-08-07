package Arrays;

import java.util.Arrays;

public class MaxSumValueInArrayPairsOfNTerms {
    public static int arrayPairSum(int[] nums) {
        if(nums.length==2){
            return Math.min(nums[0],nums[1]);
        }
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<nums.length-1;i+=2){
            max+=nums[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={6,2,6,5,1,2};
        System.out.println(arrayPairSum(arr));
    }
}
