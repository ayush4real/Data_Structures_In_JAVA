package Strings;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str="aabccbaa";
        char ch='a';
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                ans+=str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
