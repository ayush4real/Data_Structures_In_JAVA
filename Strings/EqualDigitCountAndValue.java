package Strings;

public class EqualDigitCountAndValue {

    public static boolean digitCount(String num) {
        int[] arr=new int[10];
        for(int i=0;i<num.length();i++){
            arr[num.charAt(i)-'0']++;
        }

        for(int i=0;i<num.length();i++){
            if((num.charAt(i)-'0')!=arr[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String num="1210";
        System.out.println(digitCount(num));
    }
}
