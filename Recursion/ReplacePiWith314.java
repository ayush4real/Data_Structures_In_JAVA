package Recursion;

public class ReplacePiWith314 {
    public static String replacePi(String s){
        if(s.length()<=1){
            return s;
        }
        if(s.substring(0,2).equals("pi")){
            return "3.14"+replacePi(s.substring(2));
        }else {
            return s.charAt(0)+replacePi(s.substring(1));
        }
    }

    public static void main(String[] args) {
        String str= "abpipcpdpie";
        System.out.println(replacePi(str));
    }
}
