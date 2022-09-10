package Recursion_2_3;

import java.util.HashMap;

public class PrintKeypadCodeRecursive {

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

    public static void printKeypadCode(int n, String currStr){
        if(n==0 || n==1){
            System.out.println(currStr);
            return;
        }
        int rem=n%10;
        n=n/10;
        String s=getString(rem);
        for(char c: s.toCharArray()){
            printKeypadCode(n,c+currStr);
        }
    }

    public static void main(String[] args) {
        int n=23;
        printKeypadCode(n,"");
    }
}
