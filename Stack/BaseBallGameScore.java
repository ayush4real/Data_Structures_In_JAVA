package Stack;

import java.util.Stack;

public class BaseBallGameScore {

    public static int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<ops.length;i++){
            if(ops[i]=="C"){
                stack.pop();
            } else if (ops[i]=="D") {
                int n=stack.peek()*2;
                stack.push(n);
            } else if (ops[i]=="+") {
                int n1=stack.pop();
                int n2=stack.pop();
                int n3=n1+n2;
//                if(stack.isEmpty()){
//                    return n3;
//                }
                stack.push(n2);
                stack.push(n1);
                stack.push(n3);
            }else{
                int v=Integer.valueOf(ops[i]);
//                System.out.println(v);
                stack.push(v);
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }

    public static int stringToIntHelper(String s){
        if(s.charAt(0)=='-'){
            int val=convertStringToInt(s.substring(1));
            return -val;
        }
        return convertStringToInt(s);
    }
    public static int convertStringToInt(String s){
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return (s.charAt(0)-48);
        }

        return (int)(((s.charAt(0)-48)*Math.pow(10,s.length()-1))+convertStringToInt(s.substring(1)));
    }

    public static void main(String[] args) {
        String[] ops={"5","2","C","D","+"};
        System.out.println(calPoints(ops));
    }
}
