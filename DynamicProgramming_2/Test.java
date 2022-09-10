package DynamicProgramming_2;

import java.util.Arrays;

public class Test {

//    Wrong!!!
//    public static int editDistance_2(String s, String t, int i, int j, int[][] dp){
//        if(i==s.length() && j==t.length())
//        {
//            return 0;
//        }
//        if(i==s.length())
//        {
//            return Math.max(t.length()-j,s.length()-i);
//        }
//        if(j==t.length()){
//            Math.max(t.length()-j,s.length()-i);
//        }
//        if(s.charAt(i)==t.charAt(j))
//        {
//            int ans=0;
//            if(i+1<s.length() && j+1<t.length()) {
//                if(dp[i+1][j+1]==-1) {
//                    ans = editDistance_2(s, t, i + 1, j + 1, dp);
//                    dp[i+1][j+1]=ans;
//                }else{
//                    ans=dp[i+1][j+1];
//                }
//            }
//            dp[i][j]=ans;
//            return dp[i][j];
//        }
//        else
//        {
//            int ans=0,ans=0,ant=0,ans3=0;
//            if(i+1<s.length() && j+1<t.length()){
//                if(dp[i+1][j+1]==-1) {
//                    ans= editDistance_2(s, t, i + 1, j+1, dp) + 1;
//                    dp[i+1][j+1]=ans;
//                }else{
//                    ans=dp[i+1][j+1];
//                }
//            }
//
//            if(i+1<s.length()){
//                if(dp[i+1][j]==-1) {
//                    ant = editDistance_2(s, t, i + 1, j, dp) + 1;
//                    dp[i+1][j]=ant;
//                }else{
//                    ant=dp[i+1][j];
//                }
//            }
//
//            if(j+1<t.length()){
//                if(dp[i][j+1]==-1) {
//                    ans3 = editDistance_2(s, t, i, j+1, dp) + 1;
//                    dp[i][j+1]=ans3;
//                }else{
//                    ans3=dp[i][j+1];
//                }
//            }
//
//            int val=Math.min(ans,Math.min(ant,ans3));
//            ans= val==Integer.MAX_VALUE ? 0:val;
////            dp[i][j]=ans;
//            return ans;
//        }
//    }

    public static int editDistance_3 (String s,String t,int i,int j,int[][]dp)
    {
        if(i==s.length() && j==t.length())
        {
            return 0;
        }
        if(i==s.length() || j==t.length())
        {
            return Math.max(s.length()-i,t.length()-j);
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int ans=0;
        if(s.charAt(i)==t.charAt(j))
        {
            ans=editDistance_3(s,t,i+1,j+1,dp);
        }
        else
        {
            int ans1=editDistance_3(s,t,i+1,j,dp)+1;
            int ns2=editDistance_3(s,t,i+1,j+1,dp)+1;
            int ans3=editDistance_3(s,t,i,j+1,dp)+1;

            ans=Math.min(ans1,Math.min(ns2,ans3));
        }
        dp[i][j]=ans;
        return ans;
    }

    public static void main(String[] args) {
        String s="abcd";
        String t="bcd";
        int m=s.length();
        int n=t.length();
        int[][] dp=new int[m][n];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
//        System.out.println(editDistanceHelper_1(s,t));
        System.out.println(editDistance_3(s,t,0,0,dp));
    }
}
