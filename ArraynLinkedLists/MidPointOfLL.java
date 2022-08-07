package ArraynLinkedLists;

public class MidPointOfLL {

    public static Node<Integer> midPoint(Node<Integer> head) {

        if(head==null) return head;

        Node<Integer> s=head;
        Node<Integer> f=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(4);
        Node<Integer> n2=new Node<>(6);
        Node<Integer> n3=new Node<>(9);
        Node<Integer> n4=new Node<>(5);
        Node<Integer> n5=new Node<>(1);
        Node<Integer> n6=new Node<>(2);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        Node<Integer> temp=midPoint(n1);
        System.out.println(temp.data);
    }
}
