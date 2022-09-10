package DynamicProgramming;

import java.util.Arrays;

public class MinimumStepsToOne {

//    Greedy Approach is not valid.
    public static int countMinStepsToOne(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 0;
        }
        int count=0;
        if(n%3==0){
            count=countMinStepsToOne(n/3);
        }
        else if(n%2==0){
            count=countMinStepsToOne(n/2);
        }
        else {
            count=countMinStepsToOne(n-1);
        }
        return count+1;
    }

    public static int countMinStepsToOne_1(int n){
        if(n==1){
            return 0;
        }
        int ans1,ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE;
        ans1=countMinStepsToOne_1(n-1);
        if(n%2==0){
            ans2=countMinStepsToOne_1(n/2);
        }
        if(n%3==0){
            ans3=countMinStepsToOne_1(n/3);
        }
        return Math.min(ans1,Math.min(ans2,ans3))+1;
    }

//    DP-Memoization+Recursive
    public static int countMinStepsToOne_2(int n, int[] dp){
        if(n==1){
            return 0;
        }
        int ans1,ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE;
        if(dp[n-1]==-1){
            ans1=countMinStepsToOne_2(n-1,dp);
            dp[n-1]=ans1;
        }else{
            ans1=dp[n-1];
        }
        if(n%2==0){
            if(dp[n/2]==-1){
                ans2=countMinStepsToOne_2(n/2,dp);
                dp[n/2]=ans2;
            }else{
                ans2=dp[n/2];
            }
        }
        if(n%3==0){
            if(dp[n/3]==-1){
                ans3=countMinStepsToOne_2(n/3,dp);
                dp[n/3]=ans3;
            }else{
                ans3=dp[n/3];
            }
        }
        dp[n]=Math.min(ans1,Math.min(ans2,ans3))+1;
        return dp[n];
    }

//    Iterative
    public static int countMinStepsToOne_3(int n){
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<=n;i++){
            int ans1=dp[i-1];
            int ans2=Integer.MAX_VALUE;
            int ans3=Integer.MAX_VALUE;
            if(i%3==0){
                ans3=dp[i/3];
            }
            if(i%2==0){
                ans2=dp[i/2];
            }
            dp[i]=Math.min(ans1,Math.min(ans2,ans3))+1;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=10;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        Arrays.fill(dp,-1);
        System.out.println(countMinStepsToOne_2(n,dp));
    }
}
