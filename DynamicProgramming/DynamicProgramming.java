package DynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;

public class DynamicProgramming {

    public static long staircase(int n){
        HashMap<Integer,Long> hm=new HashMap<>();
        hm.put(1, 1L);
        hm.put(2, 2L);
        hm.put(3, 4L);
        return staircaseHelper(n,hm);
    }

    public static long staircaseHelper(int n, HashMap<Integer,Long> hm) {
        long count=0;
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        for(int i=1;i<=3;i++){
            if(n-i>=0){
                count+=staircaseHelper(n-i,hm);
            }
        }
        hm.put(n,count);
        return count;
    }

    public static long staircase2(int n){
        long[] dp=new long[n+3];
        Arrays.fill(dp,-1L);
        dp[0]=1L;
        dp[1]=1L;
        dp[2]=2L;
        dp[3]=4L;
        return staircaseHelper2(n,dp);
    }

    public static long staircaseHelper2(int n, long[] dp){
        if(n==0){
            return 1L;
        }
        if(n==1){
            return 1L;
        }
        if(n==2){
            return 2L;
        }
        if(n==3){
            return 4L;
        }
        long ans1,ans2,ans3;
        if(dp[n-1]==-1L){
            ans1=staircaseHelper2(n-1,dp);
            dp[n-1]=ans1;
        }else{
            ans1=dp[n-1];
        }
        if(dp[n-2]==-1L){
            ans2=staircaseHelper2(n-2,dp);
            dp[n-2]=ans2;
        }else{
            ans2=dp[n-2];
        }
        if(dp[n-3]==-1L){
            ans3=staircaseHelper2(n-3,dp);
            dp[n-3]=ans3;
        }else{
            ans3=dp[n-3];
        }
        dp[n]=ans1+ans2+ans3;
        return dp[n];
    }

    public static long staircaseHelper3(int n){
        if(n<=1){
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        long[] dp=new long[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i+2];
        }
        return dp[n];
    }


    //    TLE
    public static long staircase_1(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }
        return staircase_1(n-1)+staircase_1(n-2)+staircase_1(n-3);
    }

    public static void main(String[] args) {
        System.out.println(staircase(10));
    }
}
