package Strings;

public class AllSubstringsAlt1 {
    public static void main(String[] args) {
        String str = "pqrs";
        for(int i=0;i<str.length();i++){
            String sub="";
            for(int j=i;j<str.length();j++){
                sub+= str.charAt(j);
                System.out.println(sub);
            }
        }
    }
}
