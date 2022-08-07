package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElements_2 {
    public static int[] nextGreaterElements(int[] nums) {
        Deque<Integer> stack=new ArrayDeque<>();
        int[] res=new int[nums.length];
        for(int i= nums.length-1;i>=0;i--){
            stack.push(nums[i]);
        }
        for(int i= nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=-1;
            }else{
                res[i]=stack.peek();
            }
            stack.push(nums[i]);
        }
        return res;
    }
}
