package TriesAndHuffman;

public class HuffManNode {
    char c;
    int freq;
    HuffManNode left;
    HuffManNode right;

    public HuffManNode(char c,int freq){
        this.c=c;
        this.freq=freq;
    }
}
