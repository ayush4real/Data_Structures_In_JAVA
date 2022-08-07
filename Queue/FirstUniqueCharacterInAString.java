package Queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueCharacterInAString {

    public static int firstUniqChar(String s) {
        Queue<Character> queue=new LinkedList<>();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray()){
            if(hm.getOrDefault(c,0)==0){
                hm.put(c,1);
                queue.add(c);
            }else if (hm.get(c)==1){
                while(!queue.isEmpty() && queue.peek()!=c){
                    queue.add(queue.remove());
                }
                hm.put(c,hm.get(c)+1);
                queue.remove();
            }
        }
        if(queue.isEmpty()){
            return -1;
        }else{
            return s.indexOf(queue.peek());
        }
    }

    public static void main(String[] args) {
        String s="aabb";
        System.out.println(firstUniqChar(s));
    }
}
