package Arrays;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]%2!=0 && nums[j]%2!=0){
                j--;
            }else if(nums[j]%2==0 && nums[i]%2!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }else if(nums[j]%2!=0 && nums[i]%2==0){
                i++;
                j--;
            }else{
                i++;
            }
        }
        return nums;
//        if(nums.length<=1){
//            return nums;
//        }
//        int ec=0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]%2==0){
//                ec++;
//            }
//        }
//        int[] arr=new int[nums.length];
//        int oddI=ec,evenI=0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]%2==0){
//                arr[evenI]=nums[i];
//                evenI++;
//            }else{
//                arr[oddI]=nums[i];
//                oddI++;
//            }
//        }
//        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,5,6,6};
        arr=sortArrayByParity(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
