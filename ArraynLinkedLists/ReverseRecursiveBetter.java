package ArraynLinkedLists;

class DoubleNode {
    Node<Integer> head;
    Node<Integer> tail;

    DoubleNode(){

    }

    DoubleNode(Node<Integer> head,Node<Integer> tail){
        this.head=head;
        this.tail=tail;
    }
}

public class ReverseRecursiveBetter {

    public static DoubleNode reverseRecursiveBetter(Node<Integer> head){
        DoubleNode ans;
        if(head==null || head.next==null){
            ans=new DoubleNode(head,head);
//            ans.head=head;
//            ans.tail=head;
            return ans;
        }
        DoubleNode temp=reverseRecursiveBetter(head.next);
        temp.tail.next=head;
        head.next=null;
        ans=new DoubleNode();
        ans.head=temp.head;
        ans.tail=head;
        return ans;
    }

    public static Node<Integer> reverseRecursiveBest(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> temp=reverseRecursiveBest(head.next);
        Node<Integer> reversedTail=head.next;
        reversedTail.next=head;
        head.next=null;
        return temp;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(4);
        Node<Integer> n2=new Node<>(6);
        Node<Integer> n3=new Node<>(9);
        Node<Integer> n4=new Node<>(5);
        Node<Integer> n5=new Node<>(1);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
//        DoubleNode temp=reverseRecursiveBetter(n1);
        Node<Integer> temp=reverseRecursiveBest(n1);
//        Node<Integer> ans=temp.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
