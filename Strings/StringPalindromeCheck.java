package Strings;

public class StringPalindromeCheck {
    public static void main(String[] args) {
        String str="abwsba";
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("Not a palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
