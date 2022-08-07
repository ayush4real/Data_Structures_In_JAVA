package ArraynLinkedLists;

public class DeleteNodeInLLWithoutAccessToHead {

    public void deleteNode(Node node) {
        Node<Integer> temp=node;
        while(temp.next.next!=null){
            temp.data=temp.next.data;
            temp=temp.next;
        }
        temp.data=temp.next.data;
        temp.next=temp.next.next;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(4);
        Node<Integer> n2=new Node<>(6);
        Node<Integer> n3=new Node<>(7);
        Node<Integer> n4=new Node<>(5);
        Node<Integer> n5=new Node<>(1);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

    }
}
