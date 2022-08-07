package Arrays;

public class SumOfAllXORSubsetTotals {
    public static void main(String[] args) {
        int[] nums={3,4,5,6,7,8};
        int sumT=0;
        int totalXOR=0;
        for(int w=1;w<= nums.length;w++){
            for(int i=0;i+w<= nums.length;i++){
                if(w==1){
                    sumT+=nums[i];
                }
                int pairXOR=0;
                for (int j=i;j<i+w;j++){
                    if(j==(i+w-1)){
                        pairXOR=nums[i]^nums[j];
                    }
                    if(w>2){
                        totalXOR^=nums[j];
                    }
                }
                sumT+=totalXOR+pairXOR;
            }
        }
        System.out.println(sumT);
    }
}
