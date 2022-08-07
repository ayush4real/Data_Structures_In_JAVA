package Arrays;

public class MaxProductsOf2EleInArray {
    public static void main(String[] args) {
        int[] nums={1,5,4,5};
        int l=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++){
            if(nums[i]>=l){
                s=l;
                l=nums[i];
            } else if (nums[i]<l && nums[i]>=s) {
                s=nums[i];
            }
        }
        System.out.println((s-1)*(l-1));
    }
}
