package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class DaysTillNextWarmerDay {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s1=new Stack<>(),s2=new Stack<>();
        int n=temperatures.length;
        int[] res=new int[n];
        int j=1;
        s1.push(temperatures[n-1]);
        for(int i=n-2;i>=0;i--){
            int c=1;
            while(!s1.isEmpty() && s1.peek()<=temperatures[i]){
                s2.push(s1.pop());
                c++;
            }
            if(s1.isEmpty()){
                res[i]=0;
            }else{
                res[i]=s2.size()+1;
            }
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            s1.push(temperatures[i]);
        }
        return res;
    }

    public static int[] dailyTemperaturesBetter1(int[] temperatures){
        Deque<Integer> stack=new ArrayDeque<>();
        int n=temperatures.length;
        int[] ans=new int[n];
        for(int cd=0;cd<n;cd++){
            int ct=temperatures[cd];
            while(!stack.isEmpty() && temperatures[stack.peek()]<ct){
                int pd=stack.pop();
                ans[pd]=cd-pd;
            }
            stack.push(cd);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] temp={89,62,70,58,47,47,46,76,100,70};
        int[] arr=dailyTemperaturesBetter1(temp);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
