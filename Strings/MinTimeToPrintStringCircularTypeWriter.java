package Strings;

public class MinTimeToPrintStringCircularTypeWriter {

    public static int minTimeToType(String word) {
        int c=word.length();
        char prev='a';
        for(int i=0;i<word.length();i++){
            char curr=word.charAt(i);
            int diff=Math.abs(curr-prev);
            int min=Math.min(diff,26-diff);
            c+=min;
            prev=curr;
        }
        return c;
    }

    public static void main(String[] args) {
        String w="bza";
        System.out.println(minTimeToType(w));
    }
}
