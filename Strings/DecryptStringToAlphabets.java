package Strings;

public class DecryptStringToAlphabets {

    public static String freqAlphabets(String s) {
        String[] al={"a","b","c","d","e","f","g","h","i","j","k","l",
                "m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        //0-9 a-i, 10-25
        String str="";
        for(int i=s.length()-1;i>=0;){
            if(s.charAt(i)=='#'){
                int v=((s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0'));
                str=al[v-1]+str;
                i-=3;
            }else{
                int v=((s.charAt(i)-'0'));
                str=al[v-1]+str;
                i--;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String s="1326#";
        System.out.println(freqAlphabets(s));
    }
}
