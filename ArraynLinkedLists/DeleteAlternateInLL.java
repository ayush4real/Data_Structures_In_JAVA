package ArraynLinkedLists;

public class DeleteAlternateInLL {

    public static Node<Integer> deleteAlternate(Node<Integer> head){
        if(head==null || head.next==null ){
            return head;
        }
        Node<Integer> temp=head;
        while(temp!=null && temp.next!=null){
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(1);
        Node<Integer> n2=new Node<>(2);
        Node<Integer> n3=new Node<>(3);
        Node<Integer> n4=new Node<>(4);
//        Node<Integer> n5=new Node<>(5);
//        Node<Integer> n6=new Node<>(6);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
//        n4.next=n5;
//        n5.next=n6;
        Node<Integer> temp=deleteAlternate(n1);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
