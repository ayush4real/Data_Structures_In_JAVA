package ArraynLinkedLists;

import java.util.HashMap;

public class FindIntersectionOfLinkedLists {

    public static Node getIntersectionNode(Node headA, Node headB) {
        Node<Integer> intersection=null;
        HashMap<Node<Integer>, Boolean> hm1 =new HashMap<>();
        HashMap<Node<Integer>, Boolean> hm2 =new HashMap<>();

        Node<Integer> temp1=headA,temp2=headB;

        while(temp1!=null){
            hm1.put(temp1,true);
            temp1=temp1.next;
        }

        while(temp2!=null){
            if(hm1.get(temp2)==null){
                hm1.put(temp2,true);
            }else{
                intersection=temp2;
                break;
            }
            temp2=temp2.next;
        }

        return intersection;
    }

    public static Node getIntersectionNodeBetter(Node headA, Node headB){
        if(headA==null || headB==null){
            return null;
        }

        int lenA=0,lenB=0;

        Node<Integer> temp1 =headA;
        Node<Integer> temp2 =headB;

        while(temp1!=null){
            lenA++;
            temp1=temp1.next;
        }

        while(temp2!=null){
            lenB++;
            temp2=temp2.next;
        }

        temp1=headA;
        temp2=headB;

        if(lenA>lenB){
            for(int i=0;i<lenA-lenB;i++){
                temp1=temp1.next;
            }
        }else{
            for(int i=0;i<lenB-lenA;i++){
                temp2=temp2.next;
            }
        }

        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }

        return temp2;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(4);
        Node<Integer> n2=new Node<>(1);
        Node<Integer> n3=new Node<>(8);
        Node<Integer> n4=new Node<>(4);
        Node<Integer> n5=new Node<>(5);
        Node<Integer> n6=new Node<>(5);
        Node<Integer> n7=new Node<>(6);
        Node<Integer> n8=new Node<>(1);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n6.next=n7;
        n7.next=n8;
        n8.next=n3;
        System.out.println(getIntersectionNodeBetter(n1,n6).data);

    }
}
