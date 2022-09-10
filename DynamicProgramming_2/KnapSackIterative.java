package DynamicProgramming_2;

public class KnapSackIterative {

    public static int knapSackIterative(int[] weights, int[] values, int maxWeight){
        int n=weights.length;
        int[][] dp=new int[n+1][maxWeight+1];

        for(int i=0;i<=n;i++){
           for(int j=0;j<=maxWeight;j++){
               if(i==0 || j==0){
                   dp[i][j]=0;
                   continue;
               }
               if(weights[i-1]<=j){
                   dp[i][j]=Math.max(values[i-1]+dp[i-1][j-weights[i-1]],dp[i-1][j]);
               }else{
                   dp[i][j]=dp[i-1][j];
               }
           }
        }
        return dp[n][maxWeight];
    }

    public static int knapSackIterative_2(int[] weights, int[] values, int maxWeight){
        int n=weights.length;
        int[][] dp=new int[n+1][maxWeight+1];
        for(int i=n;i>=0;i--){
            for(int j=0;j<=maxWeight;j++){
                if(i==n || j==0){
                    continue;
                }
                if(j<weights[i]){
                    dp[i][j]=dp[i+1][j];
                }else{
                    dp[i][j]=Math.max(values[i]+dp[i+1][j-weights[i]],dp[i+1][j]);
                }
            }
        }
        return dp[0][maxWeight];
    }

    public static void main(String[] args) {
        int[] wt={1,2,4,5};
        int[] values={5,4,8,6};
        int n=4;
        int maxW=5;
        System.out.println(knapSackIterative_2(wt,values,maxW));
    }
}
