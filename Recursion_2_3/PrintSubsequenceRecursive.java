package Recursion_2_3;

public class PrintSubsequenceRecursive {

    public static void printSubsequence(String s, String currString){
        if(s.length()==0){
            System.out.println(currString);
            return;
        }
        printSubsequence(s.substring(1),currString);
        printSubsequence(s.substring(1),currString+s.charAt(0));
    }

    public static void main(String[] args) {
        String s="abc";
        printSubsequence(s,"");
    }
}
