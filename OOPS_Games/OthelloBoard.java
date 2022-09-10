package OOPS_Games;

import java.util.Arrays;

public class OthelloBoard {
    private static char[][] board;
    private static final char EMPTY=' ';
    private char p1Symbol;
    private char p2Symbol;
    private static final int boardSize=8;
    private int count;
    private int countP1;
    private int countP2;
    private final static int[] rowDelta={-1,-1,0,1,1,1,0,-1};
    private final static int[] colDelta={0,1,1,1,0,-1,-1,-1};

    public OthelloBoard(char p1Symbol,char p2Symbol){
        board=new char[boardSize][boardSize];
        for(char[] i:board){
            Arrays.fill(i,EMPTY);
        }
        this.p1Symbol=p1Symbol;
        this.p2Symbol=p2Symbol;
        board[3][3]=p1Symbol;
        board[3][4]=p2Symbol;
        board[4][3]=p2Symbol;
        board[4][4]=p1Symbol;
        this.count=4;
        this.countP1=2;
        this.countP2=2;
    }

    private int getCount(){
        return this.count;
    }

    public void takeInput() {

    }

    public boolean move(int row, int col, char symbol){
        if(row<0 || row >=8 || col<0 || col >=8 || board[row][col] != 0){
            return false;
        }
        boolean validMove=false;
        for(int i=0;i<rowDelta.length;i++){
            int rowStep=rowDelta[i];
            int colStep=colDelta[i];

            int currRow=row+rowStep;
            int currCol=col+colStep;

            int opponentPieceCount=0;
            while(currRow>=0 && currRow<8 && currCol>=0 && currCol<8){
                if(board[currRow][currCol]==0){
                    break;
                }else if(board[currRow][currCol]!=symbol){
                    currRow+=rowStep;
                    currCol+=colStep;
                    opponentPieceCount++;
                }else{
                    if(opponentPieceCount>0){
                        validMove=true;
                        int rowEnd=currRow-rowStep;
                        int colEnd=currCol-colStep;
                        while(rowEnd!=row || colEnd!=col){
                            board[rowEnd][colEnd]=symbol;
                            rowEnd-=rowStep;
                            colEnd-=colStep;
                        }
                        board[row][col]=symbol;
                    }
                    break;
                }
            }
        }
        return validMove;
    }
}
