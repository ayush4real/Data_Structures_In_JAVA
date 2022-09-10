package OOPS_Games;

import java.util.Arrays;
import java.util.Scanner;

public class Board {
    private static char[][] board;
    private static final int boardSize=3;
    private final char p1Symbol;
    private final char p2Symbol;
//    count -no. of cells filled
    private int count;
    private static final char EMPTY=' ';

    public Board(char p1Symbol,char p2Symbol){
        board=new char[boardSize][boardSize];
        for(char[] i: board){
            Arrays.fill(i,EMPTY);
        }
        this.p1Symbol=p1Symbol;
        this.p2Symbol=p2Symbol;
        this.count=0;
    }

    private int getCount(){
        return this.count;
    }

    public void takeInput(){
        boolean p1Turn=true;
        while(getCount()<boardSize*boardSize){
            Scanner s=new Scanner(System.in);
            if(p1Turn){
                System.out.println("Player 1's Turn:");
            }else{
                System.out.println("Player 2's Turn:");
            }
            System.out.println("Enter row");
            int row=s.nextInt();
            System.out.println("Enter column");
            int col=s.nextInt();
            while(!checkIsCellValid(row-1,col-1)){
                System.out.println("Wrong row or column entered, please enter correct values!");
                System.out.println("Enter row");
                row=s.nextInt();
                System.out.println("Enter column");
                col=s.nextInt();
            }
            boolean isWinner;
            if(p1Turn){
                isWinner=setBoard(row-1,col-1,p1Symbol);
            }else{
                isWinner=setBoard(row-1,col-1,p2Symbol);
            }
            this.count++;
            if(isWinner){
                if(p1Turn){
                    System.out.println("Player 1 wins!");
                }else{
                    System.out.println("Player 2 wins!");
                }
                return;
            }
            p1Turn=!p1Turn;
        }
        System.out.println("No winner for this round");
    }

    private boolean checkIsCellValid(int row,int col){
        return row>=0 && row <= boardSize - 1 && col>=0 && col <= boardSize - 1 && board[row][col] == EMPTY;
    }

    private boolean setBoard(int row, int col, char symbol){
        if(board[row][col]==EMPTY){
            board[row][col]=symbol;
        }
        printBoard();
        return checkWinner(row,col,symbol);
    }

    private boolean checkWinner(int row,int col, int symbol){
        int rowWiseSymbol=0,columnWiseSymbol=0,diag1Symbol=0,diag2Symbol=0;
        for(char i:board[row]){
            if(i==symbol){
                rowWiseSymbol++;
            }
        }
        for(int i=0;i<boardSize;i++){
            if(board[i][col]==symbol){
                columnWiseSymbol++;
            }
        }
        for(int i=0,j=0;i<boardSize && j<boardSize;i++,j++){
            if(board[i][j]==symbol){
                diag1Symbol++;
            }
        }
        for(int i=boardSize-1,j=0;i>=0 && j<boardSize;i--,j++){
            if(board[i][j]==symbol){
                diag2Symbol++;
            }
        }
        return rowWiseSymbol==boardSize || columnWiseSymbol==boardSize
                || diag1Symbol==boardSize || diag2Symbol==boardSize;
    }

    public void printBoard(){
        for(char[] i:board){
            for(char j:i){
                System.out.print("| "+j+" |");
            }
            System.out.println();
        }
    }
}
