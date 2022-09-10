package DynamicProgramming_2;

import java.util.Arrays;

public class EqualSumPartitionPossible {

    public static boolean equalSumPartition(int[] arr, int n){
        int s=0;
        for(int i:arr){
            s+=i;
        }
        if(s%2!=0){
            return false;
        }else{
            int[][] dp=new int[n+1][(s/2)+1];
            for(int[] i: dp){
                Arrays.fill(i,-1);
            }
            return subsetSum(dp,arr,s/2,n,0)==1;
        }
    }

    public static int subsetSum(int[][] dp,int[] arr,int sum,int n, int index){
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
                return subsetSum(dp,arr,sum,n,index+1);
            }else{
                int ans1=subsetSum(dp,arr,sum-arr[index],n,index+1);
                int ans2=subsetSum(dp,arr,sum,n,index+1);
                if(ans1==1 || ans2==1){
                    dp[index][sum]=1;
                }else{
                    dp[index][sum]=0;
                }
            }
            return dp[index][sum];
        }
    }

    public static void main(String[] args) {
        int[] arr={1,5,11,5};
        int n=4;
        System.out.println(equalSumPartition(arr,n));
    }
}
