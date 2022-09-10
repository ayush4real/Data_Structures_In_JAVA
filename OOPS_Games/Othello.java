package OOPS_Games;

import java.util.Scanner;

public class Othello {
    private OthelloPlayer player1;
    private OthelloPlayer player2;
    private OthelloBoard board;

    public void startGame(){
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
        player1=new OthelloPlayer(p1Name,p1Symbol);
        player2=new OthelloPlayer(p2Name,p2Symbol);

//        creating board
        board=new OthelloBoard(p1Symbol,p2Symbol);
        board.takeInput();
    }
}
