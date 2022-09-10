package Recursion_2_3;

import java.util.HashMap;

public class ReturnKeypadCode {

    private static String getString(int val){
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(0,"");
        hm.put(1,"");
        hm.put(2,"abc");
        hm.put(3,"def");
        hm.put(4,"ghi");
        hm.put(5,"jkl");
        hm.put(6,"mno");
        hm.put(7,"pqrs");
        hm.put(8,"tuv");
        hm.put(9,"wxyz");

        return hm.get(val);
    }

    public static String[] keypad(int n){
        if(n==0 || n==1){
            return new String[]{""};
        }
        String[] res1=keypad(n/10);
        String s=getString(n%10);
        int len=s.length();
        String[] res2=new String[res1.length*len];
        int k=0;
        for (String value : res1) {
            for (int j = 0; j < s.length(); j++) {
                res2[k] = value + s.charAt(j);
                k++;
            }
        }
        return res2;
    }

    public static void main(String[] args) {
        int n=23;
        String[] arr=keypad(n);
        for(String s: arr){
            System.out.println(s);
        }
    }
}
