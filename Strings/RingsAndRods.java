package Strings;

public class RingsAndRods {

    public static int countPoints(String rings) {
        int c=0;
        for(int i=0;i<=9;i++){
            boolean r=false;
            boolean g=false;
            boolean b=false;
            for(int j=1;j<rings.length();j+=2){
                int val= (int)rings.charAt(j)-48;
                if(val==i){
                    if(rings.charAt(j-1)=='R') r=true;
                    else if(rings.charAt(j-1)=='G') g=true;
                    else if(rings.charAt(j-1)=='B') b=true;
                }
            }
            if(r && g && b) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        String s="G4";
        System.out.println(countPoints(s));
    }
}
