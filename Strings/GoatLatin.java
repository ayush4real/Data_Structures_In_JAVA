package Strings;

public class GoatLatin {

    public static String toGoatLatin(String sentence) {
        String[] arr=sentence.split(" ");
        String s1="aAeEiIoOuU";
        String s="a";
        for(int i=0;i< arr.length;i++){
            if(s1.indexOf(arr[i].charAt(0))!=-1){
                arr[i]+="ma";
            }else{
                char ch=arr[i].charAt(0);
                arr[i]=arr[i].substring(1)+ch+"ma";
            }
//            for(int j=0;j<=i;j++){
//                arr[i]+='a';
//            }
            arr[i]=arr[i]+s;
            s+="a";
        }
        return String.join(" ",arr);
    }

    public static void main(String[] args) {
        System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}
