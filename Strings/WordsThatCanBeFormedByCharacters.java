package Strings;

public class WordsThatCanBeFormedByCharacters {

    public static int countCharacters(String[] words, String chars) {
        int count=0;
        int[] ch=new int[26];
        for(char c:chars.toCharArray()){
            ch[c-'a']++;
        }

        for(String s: words){
            int[] ch2=new int[26];
            for(char c:s.toCharArray()){
                ch2[c-'a']++;
            }
            boolean flag=true;
            for(int i=0;i<ch.length;i++){
                if(ch[i]<ch2[i]){
                    flag=false;
                    break;
                }
            }
            if(flag) count+=s.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words={"cat","bt","hat","tree"};
        String s="atach";
        System.out.println(countCharacters(words,s));
    }
}
