package Strings;

public class AllAsBeforeBs {
    public static boolean checkString(String s) {
//        return !s.contains("ba");

        int b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                if(b!=0){
                    return false;
                }
            }else{
                b++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="bb";
        System.out.println(checkString(s));
    }
}
