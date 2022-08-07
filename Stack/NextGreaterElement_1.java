package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class NextGreaterElement_1 {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
        HashMap<Integer,Integer> hm=new HashMap<>();
        Deque<Integer> stack=new ArrayDeque<>();
        int n=nums2.length;
        hm.put(nums2[n-1],-1);
        stack.push(nums2[n-1]);
        for (int i=n-2;i>=0 ;i--){
            int v=nums2[i];
            while(!stack.isEmpty() && stack.peek()<v){
                stack.pop();
            }

            if(stack.isEmpty()){
                hm.put(v,-1);
            }
            else{
                hm.put(v,stack.peek());
            }
            stack.push(v);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=hm.get(nums1[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] n1={2,4};
        int[] n2={1,2,3,4};
        int[] arr=nextGreaterElement(n1,n2);
        for(int e: arr){
            System.out.print(e+" ");
        }
    }
}
