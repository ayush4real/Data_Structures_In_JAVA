package Strings;

public class RemovePalindromicSequencesToMakeStringEmpty {

    public static int removePalindromeSub(String s) {
        StringBuilder sb=new StringBuilder(s);

        if(s.equals(sb.reverse().toString())) {
            return 1;
        } else return 2;
    }

    public static void main(String[] args) {
        String str="ababa";
        System.out.println(removePalindromeSub(str));

    }
}
