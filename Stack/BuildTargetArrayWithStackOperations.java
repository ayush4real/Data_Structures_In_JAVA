package Stack;

import java.util.ArrayList;
import java.util.List;

public class BuildTargetArrayWithStackOperations {

    public static List<String> buildArray(int[] target, int n) {
        ArrayList<String> list=new ArrayList<>();
        int i=0;
        int j=1;
        while(i<target.length){
            list.add("Push");
            if(j!=target[i]){
                list.add("Pop");
            }else{
                i++;
            }
            j++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] target={1,2};
        int n=4;
        List<String> list=buildArray(target,n);
        for(String s: list){
            System.out.print(s+" ");
        }
    }
}
