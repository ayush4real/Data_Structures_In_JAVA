package Recursion;

public class RecursionRemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String s){
        if(s.length()==1){
            return s;
        }
        String str=removeConsecutiveDuplicates(s.substring(1));
        if(s.charAt(0)==str.charAt(0)){
            return str;
        }else{
            return s.charAt(0)+str;
        }
    }

    public static void main(String[] args) {
        String s="xxxyyyzwwzzz";
        System.out.println(removeConsecutiveDuplicates(s));
    }
}
