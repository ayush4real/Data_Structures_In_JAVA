package Strings;

public class CanBeTypedWords {

    public static int canBeTypedWords(String text, String brokenLetters) {
        int[] br=new int[26];
        int wLen=text.split(" ").length;
        for(int i=0;i<brokenLetters.length();i++){
            if(brokenLetters.charAt(i)!=' '){
                br[brokenLetters.charAt(i)-'a']++;
            }
        }

        int bw=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                if(bw!=0){
                    wLen--;
                    bw=0;
                }
            }else{
                if(br[text.charAt(i)-'a']!=0){
                    bw++;
                }
            }
        }
        if(bw!=0){
            wLen--;
        }
        return wLen;
    }

    public static void main(String[] args) {
        System.out.println(canBeTypedWords("hello worl","ad"));
    }
}
