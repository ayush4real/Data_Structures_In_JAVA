package Arrays;

public class SumUniqueElements {
    public static int sumOfUnique(int[] nums) {
        int[] arr=new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                c+=i;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(sumOfUnique(arr));
    }
}
