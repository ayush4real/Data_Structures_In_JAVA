package ArraynLinkedLists;

import java.util.LinkedList;
import java.util.Stack;

public class BrowserHistory {

    private Stack<String> s1;
    private Stack<String> s2;

    public BrowserHistory(String homepage) {
        s1=new Stack<>();
        s2=new Stack<>();
        s1.push(homepage);
    }

    public void visit(String url) {
        if(s1.isEmpty() && !s2.isEmpty()){
            s1.push(s2.pop());
        }
        while(!s2.isEmpty()){
            s2.pop();
        }
        s1.push(url);
    }

    public String back(int steps) {
        String str="";
        while(!s1.isEmpty() && steps>0){
            s2.push(s1.pop());
            steps--;
        }
        if(s1.isEmpty()){
            str= s2.peek();
            s1.push(s2.pop());
        }else{
            str= s1.peek();
        }
        return str;
    }

    public String forward(int steps) {
        while(!s2.isEmpty() && steps>0){
            s1.push(s2.pop());
            steps--;
        }

//        if(s2.isEmpty()){
//            return s1.peek();
//        }else{
//            return s2.peek();
//        }
        return s1.peek();
    }

    public static void main(String[] args) {
        BrowserHistory obj=new BrowserHistory("zav");
        obj.visit("kni");
//        obj.visit("fb");
//        obj.visit("yt");
        System.out.println(obj.back(7));
        System.out.println(obj.back(7));
        System.out.println(obj.forward(5));
        System.out.println(obj.forward(1));
        obj.visit("pw");
        obj.visit("mo");
//        System.out.println(obj.forward(2));
//        System.out.println(obj.back(2));
        System.out.println(obj.back(9));
    }
}
