package Strings;

public class ToLowerCase {
    public static String toLowerCase(String s) {
        return s.toLowerCase();
//        if(s.length()<1){
//            return s;
//        }
//        if(s.charAt(0)>=65 && s.charAt(0)<=90) return (char)(s.charAt(0) +32)+toLowerCase(s.substring(1));
//        else return s.charAt(0)+toLowerCase(s.substring(1));
    }

    public static void main(String[] args) {
        String s="AldjPOUEN&e";
        System.out.println(toLowerCase(s));
    }
}
