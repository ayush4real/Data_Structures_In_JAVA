package Stack;

import java.util.Stack;

public class DivideParenthesesStringIn2MinDepthStr {

    public int[] maxDepthAfterSplit(String seq){
        int[] groups=new int[seq.length()];

        int d=0;
        for(int i=0;i<seq.length();i++){
            boolean open= seq.charAt(i)=='(';
            if(open){
                d+=1;
            }
            groups[i]=d%2;
            if(!open){
                d-=1;
            }
        }
        return groups;
    }

    public static void main(String[] args) {

    }
}
