package HashMaps;

import java.util.HashMap;

public class LongestContinuousSubsetWithSum0 {

    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
        if(arr.length==0){
            return 0;
        }
        int maxLen=0,sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxLen=i+1;
            }else{
                if(hm.containsKey(sum)){
                    maxLen=Math.max(maxLen,i-hm.get(sum));
                }else{
                    hm.put(sum,i);
                }
            }
        }
        return maxLen;
    }

    public static int lengthOfLongestSubsetWithZeroSumBruteForce(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int maxLen=0;
        for(int i=0;i< arr.length;i++){
            int sum=0;
            for(int j=i;j< arr.length;j++){
                sum+=arr[j];
                if(sum==0){
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr={6,1,5,-8,-4,2};
        System.out.println(lengthOfLongestSubsetWithZeroSum(arr));
    }
}
