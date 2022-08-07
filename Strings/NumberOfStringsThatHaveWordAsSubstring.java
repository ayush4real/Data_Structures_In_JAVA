package Strings;

public class NumberOfStringsThatHaveWordAsSubstring {

    public static int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String s:patterns){
           c+=word.indexOf(s)!=-1 ? 1 : 0;
        }
        return c;
    }

    public static void main(String[] args) {
        String[] patterns={"a","b","c"};
        String word="aaaaabbbbb";
        System.out.println(numOfStrings(patterns,word));
    }
}
