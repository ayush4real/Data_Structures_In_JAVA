package Recursion_2_3;

public class ReturnSubsequences {

    public static String[] returnSubsequences(String s){
        if(s.length()==0){
            return new String[]{""};
        }
        String[] smallSubSeq=returnSubsequences(s.substring(1));
        String[] output=new String[2* smallSubSeq.length];
        System.arraycopy(smallSubSeq, 0, output, 0, smallSubSeq.length);
        int j= smallSubSeq.length;
        for (String value : smallSubSeq) {
            output[j] = s.charAt(0) + value;
            j++;
        }
        return output;
    }

    public static void main(String[] args) {
        String s="abc";
        String[] res=returnSubsequences(s);
        for(String str: res){
            System.out.println(str);
        }
    }
}
