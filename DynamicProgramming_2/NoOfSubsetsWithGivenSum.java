package DynamicProgramming_2;

import java.util.Arrays;

public class NoOfSubsetsWithGivenSum {

//    Recursive
    public static int countSubsets(int[] arr, int sum, int n, int index){
        if(index==n && sum!=0){
            return 0;
        }
        if(sum==0){
            return 1;
        }
        if(arr[index]>sum){
            return countSubsets(arr,sum,n,index+1);
        }else{
            int ans1=countSubsets(arr,sum-arr[index],n,index+1);
            int ans2=countSubsets(arr,sum,n,index+1);
            return ans1+ans2;
        }
    }

//    Recursive+Memoization
    public static int countSubsets_1(int[] arr, int sum, int n){
        int[][] dp=new int[n+1][sum+1];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
        return countSubsetsHelper_1(dp,arr,sum,n,0);
    }

    public static int countSubsetsHelper_1(int[][] dp, int[] arr, int sum, int n, int index){
        if (index == n && sum != 0) {
            return 0;
        }
        if(sum==0){
            return 1;
        }
        if(dp[index][sum]!=-1){
            return dp[index][sum];
        }else{
            if(arr[index]>sum){
                dp[index][sum]=countSubsetsHelper_1(dp,arr,sum,n,index+1);
                return dp[index][sum];
            }else{
                int ans1=countSubsetsHelper_1(dp,arr,sum-arr[index],n,index+1);
                int ans2=countSubsetsHelper_1(dp,arr,sum,n,index+1);
                dp[index][sum]=ans1+ans2;
                return dp[index][sum];
            }
        }
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
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] arr={2,3,5,6,8,10};
        int n=6;
        int sum=10;
        System.out.println(countSubsets(arr,sum,n,0));
        System.out.println(countSubsets_1(arr,sum,n));
        System.out.println(countSubsets_2(arr,sum,n));
    }
}
