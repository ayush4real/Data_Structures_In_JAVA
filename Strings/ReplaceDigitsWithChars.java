package Strings;

public class ReplaceDigitsWithChars {

    public static String replaceDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                sb.append(s.charAt(i));
            }else{
                sb.append((char)((s.charAt(i-1))+(s.charAt(i))-48));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="a1c1e1";
//        System.out.println((char)((int)('a')+('1'-48)));
        System.out.println(replaceDigits(s));
    }
}
