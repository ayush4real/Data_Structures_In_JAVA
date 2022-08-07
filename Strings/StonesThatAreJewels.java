package Strings;

public class StonesThatAreJewels {

    public static int numJewelsInStones(String jewels, String stones) {
        int count=0;
        int[] arr = new int[58];
        for(int i=0;i<jewels.length();i++){
            char c=jewels.charAt(i);
            arr[c-65]=1;
        }
        for(int i=0;i<stones.length();i++){
            char a=stones.charAt(i);
            if(arr[a-65]==1) count++;
        }
        return count;
//        for(int i=0;i<stones.length();i++){
//            char c=stones.charAt(i);
//            if(jewels.indexOf(c)>-1) count++;
//        }
//        return count;
    }

    public static void main(String[] args) {
        String j="aAb";
        String s="aAAbbbb";
        System.out.println(numJewelsInStones(j,s));
    }
}
