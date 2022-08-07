package Arrays;

public class WordsWithPrefix {
    public static int prefixCount(String[] words, String pref){
        int n=0;
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(pref)==0){
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        String[] words={"pay","attention","practice","attend"};
        System.out.println(prefixCount(words,"at"));
    }
}
