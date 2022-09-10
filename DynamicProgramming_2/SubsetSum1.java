package DynamicProgramming_2;

import java.util.Arrays;

public class SubsetSum1 {

//    Recursive-TLE
    static boolean isSubsetPresent(int[] arr, int n, int sum, int index) {
        if(n==0 && sum!=0){
            return false;
        }
        if(index==n && sum!=0){
            return false;
        }
        if(index==n && sum==0){
            return true;
        }
        return isSubsetPresent(arr, n, sum - arr[index], index + 1) || isSubsetPresent(arr, n, sum, index + 1);
    }

//    Recursive+memoization - Top Down
    static int isSubsetPresent_2(int[][] dp ,int[] arr, int n, int sum, int index){
        if(index==n && sum!=0){
            return 0;
        }
        if(sum==0){
            return 1;
        }
        if(dp[index][sum]!=-1){
            return dp[index][sum];
        }else{
            if(arr[index]>sum){
                dp[index][sum]=isSubsetPresent_2(dp,arr,n,sum,index+1);
            }else{
                int ans1=isSubsetPresent_2(dp,arr,n,sum-arr[index],index+1);
                int ans2=isSubsetPresent_2(dp,arr,n,sum,index+1);
                if(ans1==1 || ans2==1){
                    dp[index][sum]=1;
                }else{
                    dp[index][sum]=0;
                }
            }
            return dp[index][sum];
        }
    }

//    Iterative
    static boolean isSubsetPresent_3(int[] arr, int n, int sum){
        boolean[][] dp=new boolean[n+1][sum+1];
        for(int i=0;i<=sum;i++){
            dp[0][i]=false;
        }
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
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] arr={4,3,5,2};
        int sum=14;
        int[][] dp=new int[arr.length+1][sum+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
//        System.out.println(isSubsetPresent(arr,5,14,0));
        System.out.println(isSubsetPresent_2(dp,arr,arr.length,14,0));
        System.out.println(isSubsetPresent_3(arr,arr.length,sum));

        for(int[] i: dp){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
