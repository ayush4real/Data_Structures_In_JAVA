package Recursion;

public class Test {

    public static int minOperations(int[] nums, int i, int j){
        if(nums.length<=1 || j==nums.length){
            return 0;
        }

        int c=0;
        if(nums[i]<nums[j]){
            return c+minOperations(nums,i+1,j+1);
        }else{
            c=(nums[i]+1)-nums[j];
            nums[j]=nums[i]+1;
            return c+minOperations(nums,i,j);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,5,2,4,1};
        int operations=minOperations(arr,0,1);
        System.out.println(operations);
    }
}
