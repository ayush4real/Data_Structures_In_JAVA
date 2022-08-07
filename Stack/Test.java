package Stack;

public class Test {

    public static int stringToIntHelper(String s){
        if(s.charAt(0)=='-'){
            int val=convertStringToInt(s.substring(1));
            return -val;
        }
        return convertStringToInt(s);
    }
    public static int convertStringToInt(String s){
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return (s.charAt(0)-48);
        }

        return (int)(((s.charAt(0)-48)*Math.pow(10,s.length()-1))+convertStringToInt(s.substring(1)));
    }

    public static void main(String[] args) {
        System.out.println(stringToIntHelper("-1234"));
    }
}
