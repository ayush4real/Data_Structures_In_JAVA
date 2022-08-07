package ArraynLinkedLists;

import java.util.HashMap;

public class LinkedListIsCyclic {

    public static boolean hasCycle(Node head) {
        HashMap<Node<Integer>,Boolean> hm=new HashMap<>();

        Node<Integer> temp=head;
        while(temp!=null){
            if(hm.get(temp)==null){
                hm.put(temp,true);
            }else{
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    public static boolean hasCycleBetter(Node head){
        if(head==null || head.next==null){
            return false;
        }
        if(head.next==head){
            return true;
        }

        Node<Integer> f=head, s=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(4);
        Node<Integer> n2=new Node<>(6);
        Node<Integer> n3=new Node<>(7);
        Node<Integer> n4=new Node<>(5);
        Node<Integer> n5=new Node<>(1);
//        Node<Integer> n6=new Node<>(2);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n3;
        System.out.println(hasCycle(n1));
    }
}
