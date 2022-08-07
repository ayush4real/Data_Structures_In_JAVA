package Arrays;

public class DIStringMatch {
    public static int[] diStringMatch(String s){
        int nextI=0,nextD=s.length();
        int[] arr=new int[s.length()+1];

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                arr[i]=nextI++;
            }else{
                arr[i]=nextD--;
            }
        }
        if(s.charAt(s.length()-1)=='I'){
            arr[s.length()]=nextI;
        }else{
            arr[s.length()]=nextD;
        }
//        int i=s.length();
//        while(i<arr.length){
//            if(s.charAt(i-1)=='I'){
//                arr[i]=nextI++;
//            }else{
//                arr[i]=nextD--;
//            }
//            i++;
//        }
        return arr;
    }

    public static void main(String[] args) {
        String s="IDID";
        int[] arr=diStringMatch(s);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}