package Strings;

public class SumOfTwoWordsEqualToThird {

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int w1=convertStringToInt(firstWord);
        int w2=convertStringToInt(secondWord);
        int w3=convertStringToInt(targetWord);
        if(w1+w2==w3) return true;
        return false;
    }

    public static int convertStringToInt(String s){
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return (s.charAt(0)-97);
        }

        return (int)(((s.charAt(0)-97)*Math.pow(10,s.length()-1))+convertStringToInt(s.substring(1)));
    }

    public static void main(String[] args) {
        System.out.println(isSumEqual("aaa","a","aaaa"));
    }
}
