package DynamicProgramming;

import java.util.Arrays;

public class MinSquaresToRepresentN {

    public static int minSquares(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int ans1=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int ans2=minSquares(n-(i*i))+1;
            if(ans2<ans1){
                ans1=ans2;
            }
        }
        return ans1;
    }

//    Memoization+Recursion
    public static int minSquares_1(int n,int[] dp){
        if(n==0){
            return 0;
        }
        int ans1=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int ans2;
            if(dp[n-(i*i)]==-1){
                ans2=minSquares_1(n-(i*i),dp);
                dp[n-(i*i)]=ans2;
            }else{
                ans2=dp[n-(i*i)];
            }
            if(ans2<ans1){
                ans1=ans2;
            }
        }
        return ans1+1;
    }

    public static int minSquares_2(int n){
        int[] dp=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            int min1=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                int min2=1+dp[i-(j*j)];
                if(min2<min1){
                    min1=min2;
                }
            }
            dp[i]=min1;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=10;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        System.out.println(minSquares(12));
    }
}
