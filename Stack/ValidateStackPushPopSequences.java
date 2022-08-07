package Stack;

import java.util.Stack;

public class ValidateStackPushPopSequences {

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s1=new Stack<>();
        int j=0;
        int n=pushed.length;
        for(int i: pushed){
            s1.push(i);
            while(!s1.isEmpty() && j<n && s1.peek()==popped[j]){
                s1.pop();
                j++;
            }
        }
        return j==n;
    }

    public static void main(String[] args) {
        int[] pushed={1,2,3,4,5};
        int[] popped={4,5,3,2,1};
        System.out.println(validateStackSequences(pushed,popped));
    }
}
