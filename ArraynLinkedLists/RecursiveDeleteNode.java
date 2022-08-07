package ArraynLinkedLists;

public class RecursiveDeleteNode {

    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
        if(head==null && pos>=0){
            return head;
        }
        if(head.next==null && pos>0){
            return head;
        }
        if(pos==0){
            return head.next;
        }
        head.next=deleteNodeRec(head.next,pos-1);
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(1);
        Node<Integer> n2=new Node<>(6);
        Node<Integer> n3=new Node<>(9);
        Node<Integer> n4=new Node<>(5);
        Node<Integer> n5=new Node<>(1);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        Node<Integer> temp=deleteNodeRec(n1,3);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
