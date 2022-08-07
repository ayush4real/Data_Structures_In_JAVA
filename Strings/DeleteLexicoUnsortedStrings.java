package Strings;

public class DeleteLexicoUnsortedStrings {

    public static int minDeletionSize(String[] strs) {
        int count=0;
        int j=0;
        while(j<strs[0].length()){
            int i=1;
            while(i<strs.length){
                if(strs[i].charAt(j)<strs[i-1].charAt(j)){
                    count++;
                    break;
                }
                i++;
            }
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] strs={"a","b"};
        System.out.println(minDeletionSize(strs));
    }
}
