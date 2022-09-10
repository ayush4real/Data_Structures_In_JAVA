package TriesAndHuffman;

import java.util.ArrayList;

public class TriesUse {
    public static void main(String[] args) {
        Trie trie=new Trie();
        ArrayList<String> list=new ArrayList<>();
//        list.add("ABCXYX");
//        list.add("CBA");
//        System.out.println(trie.search("ABCD"));
//        System.out.println(trie.search("AB"));
//        System.out.println(trie.isPalindromePair(list));

        list.add("DO");
        list.add("DONT");
        list.add("NO");
        list.add("NOT");
        list.add("NOTE");
        list.add("NOTES");
        list.add("DEN");
        trie.autoComplete(list,"NO");
    }
}
