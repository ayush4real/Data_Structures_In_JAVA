package Arrays;

import java.util.Arrays;

public class NTimesRepeatedElement {

    public static int repeatedNTimes(int[] nums) {
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==nums[i+1] || nums[i]==nums[i+2]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
//        int e=Integer.MIN_VALUE;
//        Arrays.sort(nums);
//        for(int i=0;i<nums.length-1;i++){
//            if(nums[i]==nums[i+1]){
//                e=nums[i];
//                break;
//            }
//        }
//        return e;
    }

    public static void main(String[] args) {
        int[] arr={5,1,5,2,5,3,5,4};
        System.out.println(repeatedNTimes(arr));
    }
}
