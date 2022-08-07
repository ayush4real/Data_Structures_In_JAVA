package Strings;

public class ChessboardSquareColour {

    public static boolean squareIsWhite(String coordinates) {
        if((coordinates.charAt(0)-'a')%2==0){
            if((coordinates.charAt(1)-'0')%2!=0) return false;
            else return true;
        }else{
            if((coordinates.charAt(1)-'0')%2!=0) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        String s="c7";
        System.out.println(squareIsWhite(s));
    }
}
