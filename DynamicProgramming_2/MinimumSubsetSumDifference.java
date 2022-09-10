package DynamicProgramming_2;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumSubsetSumDifference {

    public static int minSubsetSumDiff(int[] arr){
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
        int n=arr.length;
        boolean[][] dp=subsetSum(arr,n,sum);
        int minVal=Integer.MAX_VALUE;
        for(int i=0;i<=dp[n].length/2;i++){
            if(dp[n][i]){
                minVal=Math.min(minVal,sum-2*i);
            }
        }
        return minVal;
    }

    public static boolean[][] subsetSum(int[] arr,int n,int sum){
        boolean[][] dp=new boolean[n+1][sum+1];
        Arrays.fill(dp[0],false);
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
            }
        }
        return dp;
    }

    public static void main(String[] args) {
        int[] arr={1,2,7};
        System.out.println(minSubsetSumDiff(arr));
    }
}
