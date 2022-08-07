package Arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....",
                "..",".---","-.-",".-..","--","-.","---",".--.","--.-",
                ".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] words ={"gin","zen","gig","msg"};

        Set<String> set= new HashSet<>();
        for(String word: words){
            StringBuilder str= new StringBuilder("");
            for(int i=0;i<word.length();i++){
                str.append(morse[word.charAt(i)-'a']);
            }
            set.add(str.toString());
        }
        System.out.println(set.size());
    }
}
