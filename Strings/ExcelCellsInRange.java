package Strings;

import java.util.ArrayList;
import java.util.List;

public class ExcelCellsInRange {

    public static List<String> cellsInRange(String s) {
        List<String> cells = new ArrayList<>();
        int maxWord=s.charAt(s.length()-2);
        int minWord=s.charAt(0);
        int minCell=s.charAt(1),t=minCell;
        int maxCell=s.charAt(s.length()-1);
        while(minWord<=maxWord && minCell<=maxCell){
            String w=(char)minWord+""+(minCell-48);
            cells.add(w);
            if(minCell<maxCell){
                minCell++;
            }else{
                minCell=t;
                minWord++;
            }
        }
        return cells;
    }

    public static void main(String[] args) {
        String str="A1:F1";
        List<String> cells=cellsInRange(str);
        for(String s:cells){
            System.out.print(s+" ");
        }
    }
}
