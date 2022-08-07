package Strings;

public class CheckIfStringsAreAlike {

    public static boolean halvesAreAlike(String s) {
        int n=(s.length()/2)-1;
        int j=s.length()/2;
        int i=0;
        int v1=0,v2=0;
        while(i<=n && j<s.length()){
            if(isVowel(s.charAt(i))) v1++;
            if(isVowel(s.charAt(j))) v2++;
            i++;
            j++;
        }
        return v1==v2;
    }

    public static boolean isVowel(char c){
        return switch (c) {
            case 'a', 'e', 'i', 'o', 'u','A','E','I','O','U' -> true;
            default -> false;
        };
    }

    public static void main(String[] args) {
        String s="bOOk";
        System.out.println(halvesAreAlike(s));
    }
}
