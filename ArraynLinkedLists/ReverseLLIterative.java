package ArraynLinkedLists;

public class ReverseLLIterative {

    public static Node<Integer> reverse_I(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> prev=null;
        Node<Integer> temp=head;
        while(temp!=null){
            Node<Integer> t1=temp.next;
            temp.next=prev;
//            t1.next=temp;
            prev=temp;
            temp=t1;
        }
        return prev;
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
        Node<Integer> temp=reverse_I(n1);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
