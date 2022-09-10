package TriesAndHuffman;

import java.util.ArrayList;

public class Trie {
    private TrieNode root;

    public Trie(){
        root=new TrieNode('\0');
    }

    private void addHelper(TrieNode root, String word){
        if(word.length()==0){
            root.isTerminal=true;
            return;
        }
        int childIndex=word.charAt(0)-'A';
        TrieNode child=root.children[childIndex];
        if(child==null){
            child=new TrieNode(word.charAt(0));
            root.children[childIndex]=child;
            root.childCount++;
        }
        addHelper(child,word.substring(1));
    }

    public void add(String word){
        addHelper(root,word);
    }

    private boolean searchHelper(TrieNode root,String word){
        if(word.length()==0 && root.isTerminal){
            return true;
        }
        if(word.length()==0 && !root.isTerminal){
            return false;
        }
        TrieNode child=root.children[word.charAt(0)-'A'];
        if(child==null){
            return false;
        }
        return searchHelper(child,word.substring(1));
    }

    public boolean search(String word){
        return searchHelper(root,word);
    }

    private void removeHelper(TrieNode root, String word){
        if(word.length()==0){
            root.isTerminal=false;
            return;
        }
        TrieNode child=root.children[word.charAt(0)-'A'];
        if(child==null){
            return;
        }
        removeHelper(child,word.substring(1));
    }

    private boolean removeHelper2(TrieNode root, String word){
        if(word.length()==0){
            root.isTerminal=false;
            for(TrieNode node: root.children){
                if(node!=null){
                    return false;
                }
            }
            return true;
        }
        TrieNode child=root.children[word.charAt(0)-'A'];
        if(child==null){
            return false;
        }
        boolean removeNode=removeHelper2(child,word.substring(1));
        if(removeNode){
            root.children[word.charAt(0)-'A']=null;
        }
        return removeNode;
    }

    private void removeHelper3(TrieNode root, String word){
        if(word.length()==0){
            root.isTerminal=false;
            return;
        }
        TrieNode child=root.children[word.charAt(0)-'A'];
        if(child==null){
            return;
        }
        removeHelper3(child,word.substring(1));
        if(!child.isTerminal && child.childCount==0){
            root.children[word.charAt(0)-'A']=null;
            root.childCount--;
        }
    }

    public void remove(String word){
        removeHelper2(root,word);
    }

    public int countWordsHelper(TrieNode root) {
        int count=0;
        if(root.isTerminal){
            count++;
        }
        if(root.childCount==0){
            return count;
        }
        for(TrieNode node: root.children){
            if(node!=null){
                count+=countWordsHelper(node);
            }
        }
        return count;
    }

    public int countWords(){
        return countWordsHelper(root);
    }

    private void addSuffixHelper(TrieNode root, String word){
        int i=0;
        while(i<word.length()){
            add(word.substring(i));
            add(word.substring(0,i+1));
            i++;
        }
    }

    public boolean patternMatching(ArrayList<String> vect, String pattern) {
        for(String s: vect){
            addSuffixHelper(root,s);
        }
        return search(pattern);
    }

    public void addReverse(TrieNode root,String s,int index){
        if(index==s.length()){
            root.isTerminal=true;
            return;
        }
        if(checkPalindrome(s.substring(index+1))){
            root.restPalindrome=true;
        }
        int childIndex=s.charAt(index)-'A';
        TrieNode child=root.children[childIndex];
        if(child==null){
            child=new TrieNode(s.charAt(index));
            System.out.println(child.data);
            root.children[childIndex]=child;
        }
        addReverse(child,s,index+1);
    }

    public boolean searchPalindrome(TrieNode root,String s,int index){
        System.out.println(root.data);
        if(root.isTerminal && checkPalindrome(s.substring(index))){
            System.out.println(s.substring(index));
            return true;
        }
        if(index==s.length()){
            if(root.isTerminal){
                return true;
            }
            if(root.restPalindrome){
                return true;
            }else {
                return false;
            }
        }
        TrieNode child=root.children[s.charAt(index)-'A'];
        if(child==null){
            return false;
        }
        return searchPalindrome(child,s,index+1);
    }

    public boolean isPalindromePair(ArrayList<String> words) {
        for(String s: words){
            String str=new StringBuilder(s).reverse().toString();
            System.out.println(str);
            addReverse(root, str,0);
        }
        for(String s: words){
            System.out.println(s);
            if(checkPalindrome(s) || searchPalindrome(root, s,0)){
                return true;
            }
        }
        return false;
    }

    private boolean checkPalindrome(String s){
        if(s.length()<=1){
            return true;
        }
        int i=0,j=s.length()-1;
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return checkPalindrome(s.substring(i+1,j));
    }

    public void searchAutoCompleteWord(TrieNode root, String s, int index){
        if(index==s.length()){
            if(root.isTerminal){
                System.out.println(s);
            }
            printRestWords(root,s);
            return;
        }
        int childIndex=s.charAt(index)-'A';
        TrieNode child=root.children[childIndex];
        if(child==null){
            return;
        }
        searchAutoCompleteWord(child,s,index+1);
    }

    public void printRestWords(TrieNode root,String s){
        for(TrieNode node: root.children){
            if(node!=null){
                if(node.isTerminal){
                    System.out.println(s+node.data);
                }
                printRestWords(node,s+node.data);
            }
        }
    }

    public void autoComplete(ArrayList<String> input, String word) {
        for(String s: input){
            add(s);
        }
        searchAutoCompleteWord(root,word,0);
    }

}
