package TriesAndHuffman;

public class TrieNode {
    char data;
    boolean isTerminal;
    TrieNode[] children;
    int childCount;
    boolean restPalindrome;

    public TrieNode(char data){
        this.data=data;
        this.isTerminal=false;
        this.children=new TrieNode[26];
        this.childCount=0;
        this.restPalindrome=false;
    }
}
