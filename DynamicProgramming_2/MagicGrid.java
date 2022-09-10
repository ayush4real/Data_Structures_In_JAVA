package DynamicProgramming_2;

import java.util.Arrays;

public class MagicGrid {

//    Recursive
    public static int getMinimumStrength_1(int[][] grid,int i,int j, int m,int n){
        if(i==m-1 && j==n-1){
            return 1;
        }
        int ans,ans1=Integer.MAX_VALUE,ans2=Integer.MAX_VALUE;
        if(i+1<m){
            ans1=getMinimumStrength_1(grid,i+1,j,m,n);
        }
        if(j+1<n){
            ans2=getMinimumStrength_1(grid,i,j+1,m,n);
        }
        ans=Math.min(ans1,ans2)-grid[i][j];
        return Math.max(ans,1);
    }

//    Recursive+Memoization
    public static int getMinimumStrength_2(int[][] dp, int[][] grid,int i,int j, int m,int n){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i==m || j==n){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }else{
            int ans;
            int ans1=getMinimumStrength_2(dp,grid,i+1,j,m,n);
            int ans2=getMinimumStrength_2(dp,grid,i,j+1,m,n);
            ans=Math.min(ans1,ans2)-grid[i][j];
            return dp[i][j]= Math.max(ans,1);
        }
    }

//    Iterative-Bottom Up
    public static int getMinimumStrength_3(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1){
                    dp[i][j]=1;
                    continue;
                }
                int ans,ans1=Integer.MAX_VALUE,ans2=Integer.MAX_VALUE;
                if(i+1<m){
                    ans1=dp[i+1][j];
                }
                if(j+1<n){
                    ans2=dp[i][j+1];
                }
                ans=Math.min(ans1,ans2)-grid[i][j];
                dp[i][j]=Math.max(ans,1);
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] grid={{-2,-3,3},{-5,-10,1},{10,30,-5}};
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] i: dp){
            Arrays.fill(i,-1);
        }
        System.out.println(getMinimumStrength_1(grid,0,0,2,3));
        System.out.println(getMinimumStrength_2(dp,grid,0,0,2,3));
        System.out.println(getMinimumStrength_3(grid));
    }
}
