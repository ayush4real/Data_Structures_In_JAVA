package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class OnlineStockSpan {

    Deque<Integer> s1;
    Deque<Integer> s2;

    public OnlineStockSpan() {
        s1=new ArrayDeque<>();
        s2=new ArrayDeque<>();
    }

    public int next(int price) {
        if(s1.isEmpty()){
            s1.push(price);
            s2.push(1);
            return 1;
        }else{
            int val=1;
            while(!s1.isEmpty() && s1.peek()<=price){
                val+=s2.pop();
                s1.pop();
            }
            s1.push(price);
            s2.push(val);
            return val;
        }
    }
}
