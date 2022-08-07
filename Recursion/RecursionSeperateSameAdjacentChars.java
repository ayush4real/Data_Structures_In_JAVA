package Recursion;

public class RecursionSeperateSameAdjacentChars {

    public static String addStars(String s){
        if(s.length()<=1){
            return s;
        }
        String s1=addStars(s.substring(1));
        if(s1.charAt(0)==s.charAt(0)){
            return s.charAt(0)+"*"+s1;
        }else{
            return s.charAt(0)+s1;
        }
    }

    public static void main(String[] args) {
        String s="aaaa";
        System.out.println(addStars(s));
    }
}
