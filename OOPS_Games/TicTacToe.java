package OOPS_Games;

import java.util.Scanner;

public class TicTacToe {
    private Player player1,player2;
    private Board board;

    public void startGame(){
//        take players input
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Payer 1's name");
        String p1Name=s.next();
        System.out.println("Enter Payer 1's symbol (Single character allowed!)");
        char p1Symbol=s.next().trim().charAt(0);
        while(p1Symbol==' '){
            System.out.println("Symbol not valid");
            System.out.println("Enter Payer 1's symbol (Single character allowed!)");
            p1Symbol=s.next().trim().charAt(0);
        }
        System.out.println("Enter Payer 2's name");
        String p2Name=s.next();
        System.out.println("Enter Payer 2's symbol (Single character allowed!)");
        char p2Symbol=s.next().trim().charAt(0);

        while(p2Symbol==' '){
            System.out.println("Symbol not valid");
            System.out.println("Enter Payer 2's symbol (Single character allowed!)");
            p2Symbol=s.next().trim().charAt(0);
        }
        while(p2Symbol==p1Symbol){
            System.out.println("Symbol already taken");
            System.out.println("Enter Payer 2's symbol (Single character allowed!)");
            p2Symbol=s.next().charAt(0);
        }
        player1=new Player(p1Name,p1Symbol);
        player2=new Player(p2Name,p2Symbol);

//        create board
        board=new Board(p1Symbol,p2Symbol);
//        play game
        board.takeInput();
    }

    public static void main(String[] args) {
        TicTacToe t=new TicTacToe();
        t.startGame();
    }
}
