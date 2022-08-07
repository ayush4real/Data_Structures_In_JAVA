package Recursion;

public class RecursionStringToInt {

    public static int convertStringToInt(String input){
        if(input==""){
            return 0;
        }
        if(input.length()==1){
            return (int) (input.charAt(0))-48;
        }
        return (int) ((((int)input.charAt(0)-48)*Math.pow(10,input.length()-1))+convertStringToInt(input.substring(1)));
    }

    public static void main(String[] args) {
        String s="1231";
        System.out.println(convertStringToInt(s));
    }
}
