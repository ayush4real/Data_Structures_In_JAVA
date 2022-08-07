package Arrays;

public class NumbersWithEvenNumOfDigits {
    public static int findNumbers(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
//            if(nums[i]%100==nums[i] || nums[i]%10000==nums[i]){
//                count++;
//            }
            if((nums[i]>=10 && nums[i]<=99) || (nums[i]>=1000 && nums[i]<=9999) || (nums[i]==100000)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
}
