package DynamicProgramming;

public class CoinTowerGame {

    public static String findWinner(int n, int x, int y) {
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            if(i-1>=0 && dp[i-1]==0){
                dp[i]=1;
            } else if (i-x>=0 && dp[i-x]==0) {
                dp[i]=1;
            } else if (i-y>=0 && dp[i-y]==0) {
                dp[i]=1;
            }else{
                dp[i]=0;
            }
        }
        if(dp[n]==1){
            return "Beerus";
        }else{
            return "Whis";
        }
    }

    public static void main(String[] args) {
        int n=4;
        int x=2;
        int y=3;
        System.out.println(findWinner(n,x,y));
    }
}
