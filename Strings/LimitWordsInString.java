package Strings;

public class LimitWordsInString {
    public static void main(String[] args) {
        int k=4;
        String s="Hello how are you Contestant";
        int w=0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==' '){
//                w++;
//            }
//
//            if(w==k){
//                System.out.println(s.substring(0,i));
//                return;
//            } else if (w==k-1 && i==s.length()-1) {
//                System.out.println(s);
//                return;
//            }
//        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                w++;
                if(w==k){
                    System.out.println(s.substring(0,i));
                    return;
                }
            }
        }
        System.out.println(s);
        return;
    }
}
