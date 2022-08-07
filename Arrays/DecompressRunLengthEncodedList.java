package Arrays;

public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int count=0;
        for (int i=0;i<nums.length;i+=2){
            count+=nums[i];
        }
        System.out.println(count);
        int[] arr= new int[count];
        int k=0;
        for(int i=0;i<arr.length;){
            int value=nums[k];
            while(value>=1){
                arr[i]=nums[k+1];
                i++;
                value--;
            }
            k+=2;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
