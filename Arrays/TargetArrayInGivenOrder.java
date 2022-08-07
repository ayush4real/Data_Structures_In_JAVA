package Arrays;

public class TargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};

        int[] target= new int[nums.length];
        int i=0;
        while(i<nums.length){
            int j=nums.length-1;
            while(j>index[i]){
                target[j]=target[j-1];
                j--;
            }
            target[index[i]]=nums[i];
            i++;
        }

        for(int j=0;j<target.length;j++){
            System.out.print(target[j]+" ");
        }
    }
}
