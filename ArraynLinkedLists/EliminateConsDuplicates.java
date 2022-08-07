package ArraynLinkedLists;

public class EliminateConsDuplicates {

    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        if(head.next==null || head==null){
            return head;
        }

        Node<Integer> temp=head.next;
        Node<Integer> prev=head;
        while(temp!=null){
            if(temp.data!=prev.data){
                prev.next=temp;
                prev=prev.next;
            }
            temp=temp.next;
        }
        prev.next=temp;

        temp=head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(1);
        Node<Integer> n2=new Node<>(1);
        Node<Integer> n3=new Node<>(1);
        Node<Integer> n4=new Node<>(2);
        Node<Integer> n5=new Node<>(3);
        Node<Integer> n6=new Node<>(3);
//        Node<Integer> n7=new Node<>(4);
//        Node<Integer> n8=new Node<>(4);
//        Node<Integer> n9=new Node<>(4);
//        Node<Integer> n10=new Node<>(5);
//        Node<Integer> n11=new Node<>(5);
//        Node<Integer> n12=new Node<>(7);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
//        n6.next=n7;
//        n7.next=n8;
//        n8.next=n9;
//        n9.next=n10;
//        n10.next=n11;
//        n11.next=n12;
        removeDuplicates(n1);
    }
}
