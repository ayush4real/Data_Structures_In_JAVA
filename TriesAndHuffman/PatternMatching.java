package TriesAndHuffman;

import java.util.ArrayList;

public class PatternMatching {

    public static void main(String[] args) {
        Trie trie= new Trie();
        ArrayList<String> list=new ArrayList<>();
        list.add("ABC");
        list.add("DEF");
        list.add("GHI");
        System.out.println(trie.patternMatching(list,"HIF"));
    }
}
