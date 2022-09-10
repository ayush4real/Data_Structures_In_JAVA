package DynamicProgramming_2;

import java.util.Arrays;

public class LongestCommonSubstring {

//    Recursive
    public static int longestCommonSubstring(String s, String t, int i, int j, int currMaxLen){
        if(i>=s.length() || j>=t.length()){
            return 0;
        }
        if(s.charAt(i)==t.charAt(j)){
            return longestCommonSubstring(s,t,i+1,j+1,1+currMaxLen);
        }else{
            return Math.max(currMaxLen,Math.max(longestCommonSubstring(s,t,i+1,j,0),
                    longestCommonSubstring(s,t,i,j+1,0))
            );
        }
    }

//    Recursive+Memoization
    public static int longestCommonSubstring_2(int[][] dp ,String s, String t, int i, int j, int currMaxLen){
        if(i>=s.length() || j>=t.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }else{
            if(s.charAt(i)==t.charAt(j)){
                dp[i][j]=longestCommonSubstring_2(dp,s,t,i+1,j+1,currMaxLen+1);
                return dp[i][j];
            }else{
                int ans1=longestCommonSubstring_2(dp,s,t,i+1,j,0);
                int ans2=longestCommonSubstring_2(dp,s,t,i,j+1,0);
                dp[i][j]=Math.max(currMaxLen,Math.max(ans1,ans2));
                return dp[i][j];
            }
        }
    }

//    Iterative

    public static int longestCommonSubstring_3(String s, String t){
        int[][] dp=new int[s.length()+1][t.length()+1];
        int currMaxLen=0;
        for(int i=1;i<=s.length();i++){
            for(int j=1;j<=t.length();j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    currMaxLen=Math.max(dp[i][j],currMaxLen);
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return currMaxLen;
    }

    public static void main(String[] args) {
        String s="abcde";
        String t= "abfce";
        System.out.println(longestCommonSubstring(s,t,0,0,0));
        int[][] dp=new int[s.length()+1][t.length()+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        System.out.println(longestCommonSubstring_2(dp,s,t,0,0,0));
        System.out.println(longestCommonSubstring_3(s,t));
    }
}
