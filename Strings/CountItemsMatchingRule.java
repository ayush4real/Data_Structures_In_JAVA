package Strings;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRule {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(List<String> item:items){
            if(ruleKey.equals("type") && item.get(0).equals(ruleValue)) count++;
            if(ruleKey.equals("color") && item.get(1).equals(ruleValue)) count++;
            if(ruleKey.equals("color") && item.get(2).equals(ruleValue)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> words =List.of(
                List.of("phone","blue","pixel"),
                List.of("computer","silver","phone"),
                List.of("phone","gold","iphone")
        );
        System.out.println(countMatches(words,"type","phone"));
    }
}
