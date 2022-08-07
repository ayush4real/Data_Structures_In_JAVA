package Strings;

public class ValidParenthesisString {
    public static int maxDepth(String s) {
        int max=0;
        int curPara=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                curPara++;
                max=Math.max(max,curPara);
            }else if(s.charAt(i)==')'){
                curPara--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
}
