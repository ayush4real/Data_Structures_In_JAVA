package Strings;

public class GreatestLetter {

    public static String greatestLetterBetter(String s){
        for(char c='Z';c>='A';c--){
            if(s.indexOf(c)!=-1 && s.indexOf(c+32)!=-1){
                return String.valueOf(c);
            }
        }
        return "";
    }

    public static String greatestLetter(String s) {
        int i=122;
        int j=90;
        String str="";
        while(i>=97 && j>=65){
            if(s.indexOf((char)i)!=-1 && s.indexOf((char)j)!=-1){
                str+= ((char)j);
                return str;
            }
            i--;
            j--;
        }
        return str;
    }



    public static void main(String[] args) {
        String s="lEeTcOdE";
//        System.out.println('Z'-1);
        System.out.println(greatestLetterBetter(s));
    }
}
