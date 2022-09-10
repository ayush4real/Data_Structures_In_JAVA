package DynamicProgramming_2;

import java.util.Arrays;

public class LongestCommonSubsequence {

    public static int lcs(String s,String t){
        return lcsHelper(s,t).length();
    }

    public static String lcsHelper(String s, String t) {
        if(s.length()==0 || t.length()==0){
            return "";
        }
        if(s.charAt(0)==t.charAt(0)){
            return s.charAt(0)+lcsHelper(s.substring(1),t.substring(1));
        }else{
            String ans1=lcsHelper(s,t.substring(1));
            String ans2=lcsHelper(s.substring(1),t);
            return ans1.length()>ans2.length() ? ans1:ans2;
        }
    }

//    Recursive+Memoization
    public static int lcs_2(String s,String t){
        int[][] dp=new int[s.length()+1][t.length()+1];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
        return lcsHelper_2(s,t,0,0,dp);
    }

    public static int lcsHelper_2(String s,String t, int i, int j, int[][] dp){
        if(i==s.length() || j==t.length()){
            return 0;
        }
        if(s.charAt(i)==t.charAt(j)){
            int ans1;
            if(dp[i+1][j+1]==-1){
                ans1=lcsHelper_2(s,t,i+1,j+1,dp);
                dp[i+1][j+1]=ans1;
            }else{
                ans1=dp[i+1][j+1];
            }
            dp[i][j]=1+ans1;
        }else{
            int ans1,ans2;
            if(dp[i+1][j]==-1){
                ans1=lcsHelper_2(s,t,i+1,j,dp);
                dp[i+1][j]=ans1;
            }else{
                ans1=dp[i+1][j];
            }
            if(dp[i][j+1]==-1){
                ans2=lcsHelper_2(s,t,i,j+1,dp);
                dp[i][j+1]=ans2;
            }else{
                ans2=dp[i][j+1];
            }
            dp[i][j]=Math.max(ans1,ans2);
        }
        return dp[i][j];
    }

//    Recursive+Memoization with String returned
    public static int lcs_3(String s,String t){
        String[][] dp=new String[s.length()+1][t.length()+1];
        for(String[] i: dp){
            Arrays.fill(i,"-");
        }
        String str=(lcsHelper_3(s,t,0,0,dp));
        System.out.println(str);
        return str.length();
    }

    public static String lcsHelper_3(String s,String t, int i, int j, String[][] dp){
        if(i==s.length() || j==t.length()){
            return "";
        }
        if(s.charAt(i)==t.charAt(j)){
            String ans1;
            if(dp[i+1][j+1].equals("-")){
                ans1=lcsHelper_3(s,t,i+1,j+1,dp);
                dp[i+1][j+1]=ans1;
            }else{
                ans1=dp[i+1][j+1];
            }
            dp[i][j]=s.charAt(i)+ans1;
        }else{
            String ans1,ans2;
            if(dp[i+1][j].equals("-")){
                ans1=lcsHelper_3(s,t,i+1,j,dp);
                dp[i+1][j]=ans1;
            }else{
                ans1=dp[i+1][j];
            }
            if(dp[i][j+1].equals("-")){
                ans2=lcsHelper_3(s,t,i,j+1,dp);
                dp[i][j+1]=ans2;
            }else{
                ans2=dp[i][j+1];
            }
            dp[i][j]=ans1.length()>ans2.length() ? ans1:ans2;
        }
        return dp[i][j];
    }

//    Iterative-Top Down
    public static String lcs_4(String s,String t){
        int m=s.length(),n=t.length();
        String[][] dp=new String[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    if(s.charAt(i)==t.charAt(j)){
                        dp[i][j]=""+s.charAt(i);
                    }else{
                        dp[i][j]="";
                    }
                }else{
                    if(s.charAt(i)==t.charAt(j)){
                        String ans1="";
                        if(i-1>=0 && j-1>=0){
                            ans1=dp[i-1][j-1]+s.charAt(i);
                        }else{
                            ans1=""+s.charAt(i);
                        }
                        dp[i][j]=ans1;
                    }else{
                        String ans1="",ans2="";
                        if(i-1>=0){
                            ans1=dp[i-1][j];
                        }
                        if(j-1>=0){
                            ans2=dp[i][j-1];
                        }
                        dp[i][j]=ans1.length()>ans2.length() ? ans1 : ans2;
                    }
                }
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        String s="abcdgh";
        String t="acdghr";
        System.out.println(lcs(s,t));
        System.out.println(lcs_3(s,t));
        System.out.println(lcs_4(s,t));
    }
}
