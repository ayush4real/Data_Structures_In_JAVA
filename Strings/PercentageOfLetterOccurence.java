package Strings;

public class PercentageOfLetterOccurence {

    public static int percentageLetter(String s, char letter) {
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter) c++;
        }
        return (c*100/s.length());
    }

    public static void main(String[] args) {
        String s="fffa";
        char ch='f';
        System.out.println(percentageLetter(s,ch));
    }
}
