package Strings;

public class ReversePrefixOfAWord {

    public static String reversePrefix(String word, char ch){
        if(word.indexOf(ch)!=-1){
            StringBuilder sb=new StringBuilder(word.substring(0,word.indexOf(ch)+1));
//            sb=word.substring(0,word.indexOf(ch)+1);
            return sb.reverse()+word.substring(word.indexOf(ch)+1);
        }
        return word;
    }

    public static String reversePrefixAlt1(String word, char ch) {
        String s="";
        int j=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                j=i;
                break;
            }
        }
        for(int i=j;i>=0;i--){
            s+=word.charAt(i);
        }
        return s+word.substring(j+1);
    }

    public static void main(String[] args) {
        String s="abcdefd";
        char ch='d';
        System.out.println(reversePrefix(s,ch));
    }
}
