package Recursion_2_3;

public class PlaceKKnightsOnChessBoard {

    static int m,n;

    public static boolean isSafe(int[][] chess, int i, int j){
        return chess[i][j] == 0;
    }

    public static void attack(int[][] chess, int i,int j){
        if(i-1>=0 && j-2>=0){
            chess[i-1][j-2]=-1;
        }
        if(i-1>=0 && j+2<n){
            chess[i-1][j+2]=-1;
        }
        if(i+1<m && j-2>=0){
            chess[i+1][j-2]=-1;
        }
        if(i+1<m && j+2<n){
            chess[i+1][j+2]=-1;
        }
        if(i-2>=0 && j-1>=0){
            chess[i-2][j-1]=-1;
        }
        if(i-2>=0 && j+1<n){
            chess[i-2][j+1]=-1;
        }
        if(i+2<m && j-1>=0){
            chess[i+2][j-1]=-1;
        }
        if(i+2<m && j+1<n){
            chess[i+2][j+1]=-1;
        }
    }

    public static void placeKnight(int[][] chess,int[][] newChess, int i,int j){
        for(int a=0;a<m;a++){
            for(int b=0;b<n;b++){
                newChess[a][b]=chess[a][b];
            }
        }
        newChess[i][j]=1;
        attack(newChess,i,j);
    }

    public static void placeKKnights(int[][] chess,int startRow,int startCol,int k){
        if(k==0){
            for(int[] i:chess){
                for(int j: i){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            System.out.println();
        }else{
            for(int i=startRow;i<m;i++){
                for(int j=startCol;j<n;j++){
                    if(isSafe(chess,i,j)){
                        int[][] newChess=new int[m][];
                        for(int x=0;x<m;x++){
                            newChess[x]=new int[n];
                        }
                        placeKnight(chess,newChess,i,j);
                        placeKKnights(newChess,i,j,k-1);
                    }
                }
                startCol=0;
            }
        }
    }

    public static void main(String[] args) {
        int k=5;
        m=3;
        n=3;
        int[][] chess=new int[m][n];
        placeKKnights(chess,0,0,k);
    }
}
