package ArraynLinkedLists;

public class ReverseLLRecursive {

    public static Node<Integer> reverseLinkedListRec(Node<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> node= reverseLinkedListRec(head.next);
        Node<Integer> temp=node;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head.next=null;
        return node;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(null);
//        Node<Integer> n2=new Node<>(6);
//        Node<Integer> n3=new Node<>(9);
//        Node<Integer> n4=new Node<>(5);
//        Node<Integer> n5=new Node<>(1);
//        n1.next=n2;
//        n2.next=n3;
//        n3.next=n4;
//        n4.next=n5;
        Node<Integer> temp=reverseLinkedListRec(n1);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
