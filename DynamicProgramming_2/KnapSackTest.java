package DynamicProgramming_2;

public class KnapSackTest {
    //    public static int knapSack01RecursiveMemoization(int[][] dp,int[] weights, int[] values, int n, int maxWeight, int i) {
//        if(i>=n || maxWeight==0){
//            return 0;
//        }
//        int ans;
//        if(weights[i]>maxWeight){
//            if(dp[i][maxWeight]==-1){
//                ans=knapSack01RecursiveMemoization(dp,weights,values,n,maxWeight,i+1);
//                dp[i][maxWeight]=ans;
//            }else{
//                ans=dp[i][maxWeight];
//            }
//        }else{
//            int ans1,ans2;
//            if(dp[i][maxWeight-weights[i]]==-1){
//                ans1=values[i]+ knapSack01RecursiveMemoization(dp,weights,values,n,maxWeight-weights[i],i+1);
//                dp[i][maxWeight-weights[i]]=ans1;
//            }else{
//                ans1=dp[i][maxWeight-weights[i]];
//            }
//
//            if(dp[i][maxWeight]==-1){
//                ans2=knapSack01RecursiveMemoization(dp,weights,values,n,maxWeight,i+1);
//                dp[i][maxWeight]=ans2;
//            }else{
//                ans2=dp[i][maxWeight];
//            }
//            ans=Math.max(ans1,ans2);
//        }
//        return dp[i][maxWeight]=ans;
//    }
}
