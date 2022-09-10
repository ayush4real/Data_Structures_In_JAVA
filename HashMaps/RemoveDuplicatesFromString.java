package HashMaps;

import java.util.HashMap;

public class RemoveDuplicatesFromString {

    public static String uniqueChar(String str){
        StringBuilder s= new StringBuilder();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c :str.toCharArray()){
            if(hm.getOrDefault(c,0)==0){
                s.append(c);
                hm.put(c,1);
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        String str="ababacd";
        System.out.println(uniqueChar(str));
    }
}
