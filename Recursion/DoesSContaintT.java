package Recursion;

public class DoesSContaintT {

    public static boolean checkSequence(String a, String b){
        if(a.length()<b.length()){
            return false;
        }
        if(b==""){
            return true;
        }
        if(a==""){
            return false;
        }
        if(a.charAt(0)!=b.charAt(0)){
            return checkSequence(a.substring(1),b);
        }
        return checkSequence(a.substring(1),b.substring(1));
    }

    public static void main(String[] args) {
        String a="st3h5irteuyarh!";
        String b="shrey";
        System.out.println(checkSequence(a,b));
    }
}
