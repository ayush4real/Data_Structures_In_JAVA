package Strings;

import java.util.List;

public class DestinationCity {

    public static String destCity(List<List<String>> paths) {
        String s="";
        for(int i=0;i< paths.size();i++){
            boolean dest=true;
            for(int j=0;j<i;j++){
                if(paths.get(i).get(1).equals(paths.get(j).get(0))){
                    dest=false;
                }
            }
            for(int j=i+1;j< paths.size();j++){
                if(paths.get(i).get(1)==paths.get(j).get(0)){
                    dest=false;
                }
            }
            if(dest) s=paths.get(i).get(1);
        }
        return s;
    }

    public static void main(String[] args) {


        List<List<String>> paths=List.of(
                List.of("London","New York"), List.of("New York","Lima"), List.of("Lima","Sao Paulo")
        );
        System.out.println(destCity(paths));
    }
}
