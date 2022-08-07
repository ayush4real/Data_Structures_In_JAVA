package ArraynLinkedLists;

public class InsertNode {

    public static void insertNode(Node head,int n, int idx){
        int i=1;
        Node<Integer> temp=head;
        while(i<idx){
            temp=temp.next;
            i++;
        }
        Node<Integer> t1=new Node<>(n);
        t1.next=temp.next;
        temp.next=t1;

        temp=head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        Node<Integer> n4=new Node<>(40);
        Node<Integer> n5=new Node<>(50);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        insertNode(n1,15,3);
    }
}
