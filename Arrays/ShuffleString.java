package Arrays;

public class ShuffleString {
    public static void main(String[] args) {
        int[] indices={4,5,6,7,0,2,1,3};
        String s="codeleet";
        char str[]= new char[s.length()];
//        for(int i=0;i<indices.length;i++){
//            str[indices[i]]=s.charAt(i);
//        }
//        String word="";
//        for(int i=0;i<str.length;i++){
//            word+=str[i];
//        }
//
//        char[] alpha= new char[101];
//        for(int i=0;i< indices.length;i++){
//            alpha[indices[i]]=s.charAt(i);
//        }
//        for(int i=0;i<indices.length;i++){
//            s+=alpha[i];
//        }

        for(int i=0;i<indices.length;i++){
            str[indices[i]]=s.charAt(i);
        }

        System.out.println(new String(str));

//        System.out.println(s.substring(indices.length));
    }
}
