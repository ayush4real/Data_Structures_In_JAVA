package Arrays;

public class NumbersLessThanCurrentNum {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        int[] counts= new int[101];

        for(int i=0;i<nums.length;i++){
            counts[nums[i]]++;
        }
        for(int i=1;i<counts.length;i++){
            counts[i]+=counts[i-1];
        }
        for(int i=0;i<nums.length;i++){
            int number=nums[i];
            nums[i]= number==0 ? 0 : counts[number-1];
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
