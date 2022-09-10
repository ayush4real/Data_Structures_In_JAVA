package DynamicProgramming_2;

import java.util.Arrays;

public class KnapSack01RecursiveMemoization {


    public static int knapSack01RecursiveMemoization(int[][] dp,int[] weights, int[] values, int n, int maxWeight, int i) {
        if(i>=n || maxWeight==0){
            return 0;
        }
        if(dp[i][maxWeight]!=-1){
            return dp[i][maxWeight];
        }else{
            int ans;

            if(weights[i]>maxWeight){
                ans=knapSack01RecursiveMemoization(dp,weights,values,n,maxWeight,i+1);
            }else{
                int ans1=values[i]+knapSack01RecursiveMemoization(dp,weights,values,
                        n,maxWeight-weights[i],i+1);
                int ans2=knapSack01RecursiveMemoization(dp,weights,values,
                        n,maxWeight,i+1);
                ans=Math.max(ans1,ans2);
            }
            dp[i][maxWeight]=ans;
            return ans;
        }
    }

    public static void main(String[] args) {
        int[] wt={1,2,4,5};
        int[] values={5,4,8,6};
        int n=4;
        int maxW=5;
        int[][] dp=new int[n+1][maxW+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }

        System.out.println(knapSack01RecursiveMemoization(dp,wt,values,n,maxW,0));
    }
}
