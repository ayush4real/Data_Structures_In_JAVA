package Strings;

public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int l1=word1.length(),l2=word2.length();
        int i=0,j=0;
        while(i<l1 || j<l2){
            if(i<l1){
                sb.append(word1.charAt(i));
                i++;
            }
            if(j<l2){
                sb.append(word2.charAt(j));
                j++;
            }
        }
        return sb.toString();
//        int i=0,j=0;
//        while(i<word1.length() && j<word2.length()){
//            s+=(word1.charAt(i));
//            s+=(word2.charAt(j));
//            i++;
//            j++;
//        }
//        while(i<word1.length()){
//            s+= word1.charAt(i);
//            i++;
//        }
//        while(j<word2.length()){
//            s+= word2.charAt(j);
//            j++;
//        }
//        return s;
    }

    public static void main(String[] args) {
        String w1="ab";
        String w2="pqrs";
        System.out.println(mergeAlternately(w1,w2));
    }
}
