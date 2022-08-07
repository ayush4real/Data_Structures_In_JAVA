package ArraynLinkedLists;

public class SeparateLLIntoOddAndEvenIndexedList {

    public static Node<Integer> oddEvenList(Node<Integer> head) {
        if(head==null){
            return head;
        }
        Node<Integer> eHead=head.next;
        Node<Integer> even=head.next;
        Node<Integer> odd=head;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=eHead;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(1);
        Node<Integer> n2=new Node<>(2);
        Node<Integer> n3=new Node<>(3);
        Node<Integer> n4=new Node<>(4);
        Node<Integer> n5=new Node<>(5);
//        Node<Integer> n6=new Node<>(2);
//        Node<Integer> n7=new Node<>(2);
//        Node<Integer> n8=new Node<>(0);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
//        n5.next=n6;
//        n6.next=n7;
//        n7.next=n8;
        Node<Integer> temp=oddEvenList(n1);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
