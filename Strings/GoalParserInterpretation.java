package Strings;

public class GoalParserInterpretation {
    public static String interpret(String command){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<command.length();){
            char c=command.charAt(i);
            if(c=='G'){
                s.append(c);
                i++;
            }else{
                if (command.charAt(i+1)==')'){
                    s.append('o');
                    i+=2;
                }else {
                    s.append("al");
                    i+=4;
                }
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        String str="(al)G(al)()()G";
        System.out.println(interpret(str));
    }
}
