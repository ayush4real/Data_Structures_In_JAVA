package Recursion;

public class RecursionReplaceCharacter {

    public static String replaceChar(String s, char a, char b){
        if(s.length()==0){
            return s;
        }
        String str2=replaceChar(s.substring(1),a,b);
        if(s.charAt(0)==a){
            return b+str2;
        }else{
            return s.charAt(0)+str2;
        }
    }

    public static String replaceChar1(String s, char a, char b){
        if(s.length()==0){
            return s;
        }
        if(s.charAt(0)==a){
            return b+replaceChar1(s.substring(1),a,b);
        }else{
            return s.charAt(0)+replaceChar1(s.substring(1),a,b);
        }
    }

    public static void main(String[] args) {
        String s="abbccdb";
        System.out.println(replaceChar1(s,'b','a'));
    }
}
