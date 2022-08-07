package ArraynLinkedLists;

public class RemoveOccurencesOfValueInLL {

    public static Node<Integer> removeElements(Node<Integer> head, int val) {
        if(head==null){
            return null;
        }
        if(head.next==null && head.data!=val){
            return head;
        }

        if(head.data==val){
            head=removeElements(head.next,val);
        }else{
            head.next=removeElements(head.next,val);
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(1);
        Node<Integer> n2=new Node<>(2);
        Node<Integer> n3=new Node<>(6);
        Node<Integer> n4=new Node<>(3);
        Node<Integer> n5=new Node<>(4);
        Node<Integer> n6=new Node<>(5);
        Node<Integer> n7=new Node<>(6);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        Node<Integer> temp= removeElements(n1,4);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
