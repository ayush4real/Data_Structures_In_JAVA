package DynamicProgramming_2;

import java.util.Arrays;

public class MinCostPath {

    public static int minCostPath(int[][] input) {
        int m=input.length;
        int n=input[0].length;
        return minCostPathHelper(input,0,0,m,n);
    }

//    Recursive
    public static int minCostPathHelper(int[][] input, int i, int j,int m,int n) {
        if(i==m-1 && j==n-1){
            return input[i][j];
        }
        int ans1=Integer.MAX_VALUE,ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE;
        if(j+1<n){
            ans1=minCostPathHelper(input,i,j+1,m,n);
        }
        if(i+1<m){
            ans2=minCostPathHelper(input,i+1,j,m,n);
        }
        if(i+1<m && j+1<n){
            ans3=minCostPathHelper(input,i+1,j+1,m,n);
        }
        return input[i][j]+Math.min(ans1,Math.min(ans2,ans3));
    }

//    Recursive+Memoization
    public static int minCostPath_2(int[][] input, int[][] dp,int i, int j, int m, int n){
        int ans1=Integer.MAX_VALUE,ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE;
        if(i+1<m){
            if(dp[i+1][j]==-1){
                ans1=minCostPath_2(input,dp,i+1,j,m,n);
                dp[i+1][j]=ans1;
            }else{
                ans1=dp[i+1][j];
            }
        }
        if(j+1<n){
            if(dp[i][j+1]==-1){
                ans2=minCostPath_2(input,dp,i,j+1,m,n);
                dp[i][j+1]=ans2;
            }else{
                ans2=dp[i][j+1];
            }
        }
        if(i+1<m && j+1<n){
            if(dp[i+1][j+1]==-1){
                ans3=minCostPath_2(input,dp,i+1,j+1,m,n);
                dp[i+1][j+1]=ans3;
            }else{
                ans3=dp[i+1][j+1];
            }
        }
        dp[i][j]=input[i][j]+Math.min(ans1,Math.min(ans2,ans3));
        return dp[i][j];
    }

//    Iterative
    public static int minCostPath_3(int[][] input){
        int m=input.length;
        int n=input[0].length;
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1){
                    dp[i][j]=input[i][j];
                    continue;
                }
                dp[i][j]=input[i][j] +Math.min(dp[i+1][j],Math.min(dp[i][j+1],dp[i+1][j+1]));
            }
        }
        return dp[0][0];
    }

//    Iterative TopDown
    public static int minCostPath_4(int[][] input){
        int m=input.length;
        int n=input[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j]=input[i][j];
                    continue;
                }
                int ans1=Integer.MAX_VALUE,ans2=Integer.MAX_VALUE,ans3=Integer.MAX_VALUE;
                if(i-1>=0){
                    ans1=dp[i-1][j];
                }
                if(j-1>=0){
                    ans2=dp[i][j-1];
                }
                if(i-1>=0 && j-1>=0){
                    ans3=dp[i-1][j-1];
                }
                dp[i][j]=input[i][j]+Math.min(ans1,Math.min(ans2,ans3));
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] matrix={{5,7,2,4},{1,8,1,3},{6,2,9,5},{1,6,2,8}};
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] dp=new int[m][n];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
        dp[m-1][n-1]=matrix[m-1][n-1];
        System.out.println(minCostPath_3(matrix));
    }
}
