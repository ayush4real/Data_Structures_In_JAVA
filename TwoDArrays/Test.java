package TwoDArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        gain[0]=0+gain[0];
        for(int i=1;i<gain.length;i++){
            gain[i]=gain[i-1]+gain[i];
        }
        for(int i=1;i<gain.length;i++){
            int j=i-1;
            int temp=gain[i];
            while(j>=0 && gain[j]>temp){
                gain[j+1]=gain[j];
                j--;
            }
            gain[j+1]=temp;
        }
//        for(int i=1;i<gain.length;i++){
//            System.out.print(gain[i]+" ");
//        }

        System.out.println(Math.max(gain[gain.length - 1], 0));

//        for(int i=0;i<words.length;i++){
//            int j=0;
//            int k=words[i].length()-1;
//            while(j<k){
//                if(words[i].charAt(j)!=words[i].charAt(k)) {
//                    break;
//                }
//                j++;
//                k--;
//            }
//            if(j>=k){
//                System.out.println(words[i]);
//                return;
//            }
//        }

//        int points[][]={{1,1},{3,4},{-1,0}};
//        int sec=0;
//        for (int i = 0; i+1 < points.length; i++) {
//           sec+= Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1]));
//        }
//        System.out.println(sec);
    }
}
