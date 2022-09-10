package Recursion_2_3;

public class NQueens {

    public static void placeQueen(int[][] matrix,int n, int row){
        if(row==n){
            for(int[] arr:matrix){
                for (int val: arr){
                    System.out.print(val+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(matrix,n,row,col)){
                matrix[row][col]=1;
                placeQueen(matrix,n,row+1);
                matrix[row][col]=0;
            }
        }
    }

    private static boolean isSafe(int[][] matrix, int n, int row, int col) {
        int i,j;
        for(i=row-1;i>=0;i--){
            if (matrix[i][col]==1){
                return false;
            }
        }
        for(i=row,j=col;i>=0 && j>=0;i--,j--){
            if (matrix[i][j]==1){
                return false;
            }
        }

        for(i=row,j=col;i>=0 && j<n;i--,j++){
            if (matrix[i][j]==1){
                return false;
            }
        }
        return true;
    }

    public static void placeNQueens(int n){
        int[][] matrix=new int[n][n];
        placeQueen(matrix,n,0);
    }

    public static void main(String[] args) {
        placeNQueens(4);
    }
}
