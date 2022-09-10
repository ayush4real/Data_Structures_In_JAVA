package DynamicProgramming_2;

import java.util.Arrays;

public class SmallestSuperSequenceLength {

//    Recursive
    public static int smallestSuperSequence_1(String s, String t,int i,int j){
        if(i>=s.length() || j>=t.length()){
            return Math.max(s.length()-i,t.length()-j);
        }

        if(s.charAt(i)==t.charAt(j)){
            return 1+smallestSuperSequence_1(s,t,i+1,j+1);
        }else{
            int ans1=1+smallestSuperSequence_1(s,t,i+1,j);
            int ans2=1+smallestSuperSequence_1(s,t,i,j+1);
            return Math.min(ans1,ans2);
        }
    }

    public static int smallestSuperSequence_2(int[][] dp, String s, String t,int i,int j){
        if(i>=s.length() || j>=t.length()){
            return Math.max(s.length()-i,t.length()-j);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }else{
            if(s.charAt(i)==t.charAt(j)){
                dp[i][j]= 1+smallestSuperSequence_2(dp,s,t,i+1,j+1);
                return dp[i][j];
            }else{
                int ans1=1+smallestSuperSequence_2(dp,s,t,i+1,j);
                int ans2=1+smallestSuperSequence_2(dp,s,t,i,j+1);
                dp[i][j]=Math.min(ans1,ans2);
                return dp[i][j];
            }
        }
    }

//    Iterative - Bottom Up
    public static int smallestSuperSequence_3(String s, String t){
        int m=s.length();
        int n=t.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=m;i>=0;i--){
            for(int j=n;j>=0;j--){
                if(i==m){
                    dp[i][j]=n-j;
                    continue;
                }
                if(j==n){
                    dp[i][j]=m-i;
                    continue;
                }
                if(s.charAt(i)==t.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
                }else{
                    int ans1=dp[i+1][j];
                    int ans2=dp[i][j+1];
                    dp[i][j]=1+Math.min(ans1,ans2);
                }
            }
        }
        return dp[0][0];
    }

//    Iterative - Top Down
    public static int smallestSuperSequence_4(String s, String t){
        int m=s.length();
        int n=t.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0){
                    dp[i][j]=j;
                    continue;
                }
                if(j==0){
                    dp[i][j]=i;
                    continue;
                }
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    int ans1=1+dp[i-1][j];
                    int ans2=1+dp[i][j-1];
                    dp[i][j]=Math.min(ans1,ans2);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s="abc";
        String t="fbc";
        int m=s.length();
        int n=t.length();
        int[][] dp=new int[m+1][n+1];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
        System.out.println(smallestSuperSequence_1(s,t,0,0));
        System.out.println(smallestSuperSequence_2(dp,s,t,0,0));
        System.out.println(smallestSuperSequence_3(s,t));
        System.out.println(smallestSuperSequence_4(s,t));
    }
}
