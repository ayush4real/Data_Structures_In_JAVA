package Recursion;

public class RecursionPalindromeCheck {

    public static boolean isStringPalindrome(String input){
        if(input.length()<=1){
            return true;
        }
        int i=0,j=input.length()-1;
        if(input.charAt(i)!=input.charAt(j)){
            return false;
        }
        return isStringPalindrome(input.substring(i+1,j));
    }

    public static void main(String[] args) {
        String str="a";
        System.out.println(isStringPalindrome(str));
    }
}
