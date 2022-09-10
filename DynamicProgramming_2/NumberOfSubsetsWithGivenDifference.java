package DynamicProgramming_2;

import java.util.Arrays;

public class NumberOfSubsetsWithGivenDifference {

    public static int subsetsWithGivenDiff(int[] arr, int diff){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        int n=arr.length;
        int sumForSubset1=(diff+sum)/2;
        System.out.println(sumForSubset1);
        int countOfSubsets=countSubsets_2(arr,sumForSubset1,n);
        System.out.println(countOfSubsets);
        return countOfSubsets;
    }

    public static int countSubsets_2(int[] arr, int sum, int n){
        int[][] dp=new int[n+1][sum+1];
        for(int i=0;i<=sum;i++){
            dp[0][i]=0;
        }
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
                }
            }
        }
        System.out.println(dp[n][sum]);
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,1,1};
        int diff=3;
        System.out.println(subsetsWithGivenDiff(arr,diff));
    }
}
