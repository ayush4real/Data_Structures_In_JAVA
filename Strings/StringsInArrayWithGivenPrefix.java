package Strings;

public class StringsInArrayWithGivenPrefix {

    public static int countPrefixes(String[] words, String s) {
        if(s.length()<1){
            return 0;
        }
        int count =0;
        for(int i=0;i<words.length;i++){
            if(s.startsWith(words[i])) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words={"feh","w","w","lwd","c","s","vk","zwlv","n","w",
                "sw","qrd","w","w","mqe","w","w","w","gb","w","qy","xs",
                "br","w","rypg","wh","g","w","w","fh","w","w","sccy"};
        String s="w";
        System.out.println(countPrefixes(words,s));
    }
}
