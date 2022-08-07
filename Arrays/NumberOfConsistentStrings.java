package Arrays;

public class NumberOfConsistentStrings {
    public static void main(String[] args) {
        String allowed="ab";
        String[] words={"ad","bd","aaab","baa","badab","a"};

        int c=0;

        for(int i=0;i< words.length;i++){
            int j=0;
            for(;j<words[i].length();j++){
                if(allowed.indexOf(words[i].charAt(j))>=0){
                    continue;
                }else {
                    break;
                }
            }
            c+= j==words[i].length() ? 1 : 0;
//            if(j==words[i].length()){
//                c++;
//            }
        }
        System.out.println(c);

//        int c=0;
//        int[] arr= new int[256];
//        for(int i=0;i<allowed.length();i++){
//            arr[allowed.charAt(i)]=1;
//        }
//
//        for(int i=0;i<words.length;i++){
//            int j=0;
//            for(;j<words[i].length();j++){
//                if(arr[words[i].charAt(j)]!=1){
//                    break;
//                }
//            }
//            if(j==words[i].length()){
//                c++;
//            }
//        }
//        System.out.println(c);

//        int count = words.length;
//        int[] store = new int[26];
//
//        for (char c : allowed.toCharArray()){
//            store[c-'a']++;
//        }
//
//        for (String word : words) {
//
//            for (char c : word.toCharArray()) {
//                if (store[c-'a'] == 0){
//                    count--;
//                    break;
//                }
//            }
//        }
//        System.out.println(count);
    }
}
