package Strings;

public class RobotReturnToOrigin {

    public static boolean judgeCircle(String moves) {
        if(moves.length()==1){
            return false;
        }
        int l=0,r=0,d=0,u=0;
        for(int i=0;i<moves.length();i++){
            if (moves.charAt(i) == 'L') {
                l--;
            } else if (moves.charAt(i) == 'R') {
                r++;
            } else if (moves.charAt(i) == 'U') {
                u++;
            } else if (moves.charAt(i) == 'D') {
                d--;
            } else {
                return false;
            }
        }
        if((l+r)==0 && (d+u)==0) return true;
        else return false;
    }

    public static void main(String[] args) {
        String s="UDLL";
        System.out.println(judgeCircle(s));
    }
}
