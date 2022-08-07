package Strings;

public class IsStringPanagram {
    public static boolean checkIfPangram(String sentence) {
        for(int i=97;i<=122;i++){
            if(sentence.indexOf((char)i)==-1) return false;
        }
        return true;
//        String s="";
//        for(int i=0;i<sentence.length();i++){
//            if(s.indexOf(sentence.charAt(i))<0) s+=sentence.charAt(i);
//        }
//        return s.length()==26;
    }

    public static void main(String[] args) {
        String s="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }
}
