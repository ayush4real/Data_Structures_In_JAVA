package ArraynLinkedLists;

public class DeleteNode {

    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        if(pos==0){
            head=head.next;
            return head;
        }

        int i=0;
        Node<Integer> temp=head;
        while(i<pos-1 && temp!=null){
            temp=temp.next;
            i++;
        }
        if(temp==null || temp.next==null){
            return head;
        }

        if(temp.next!=null){
            temp.next=temp.next.next;
        }else {
            temp.next=null;
        }

        temp=head;

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

        return head;
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
        System.out.println(deleteNode(n1,4).data);
    }
}
