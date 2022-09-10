package DynamicProgramming_2;

import java.util.Arrays;

public class EditStringDistance {

    public static int editDistance_1(String s, String t) {
        return editDistanceHelper_1(s,t);
    }

    public static int editDistanceHelper_1(String s, String t) {
        if(s.length()==0 && t.length()==0){
            return 0;
        }
        if(s.length()==0){
            return t.length();
        }
        if(t.length()==0){
            return s.length();
        }

        if(s.charAt(0)==t.charAt(0)){
            int ans=editDistanceHelper_1(s.substring(1),t.substring(1));
            return ans;
        }else{
            int ansReplace=1+editDistanceHelper_1(s.substring(1),t.substring(1));
            int ansDelete=1+editDistanceHelper_1(s.substring(1),t);
            int ansInsert=1+editDistanceHelper_1(s,t.substring(1));
            return Math.min(ansReplace,Math.min(ansDelete,ansInsert));
        }
    }

//    Recursive+Memoization
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

//    Iterative - Top Down
    public static int editDistance_3 (String s,String t){
        int m=s.length();
        int n=t.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=i;
        }
        for(int i=0;i<dp[0].length;i++){
            dp[0][i]=i;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else {
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }
        }
        return dp[m][n];
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
