package ArraynLinkedLists;

public class EvenAfterOdd {

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        Node<Integer> temp=head;
        if(head==null || head.next==null){
            return head;
        }

        Node<Integer> eh=null;
        Node<Integer> oh=null;
        Node<Integer> et=null;
        Node<Integer> ot=null;
        while (temp!=null){
            if(temp.data%2==0){
                if(eh==null){
                    eh=new Node<>(temp.data);
                    et=eh;
                }else{
                    et.next=new Node<>(temp.data);
                    et=et.next;
                }
            }else{
                if(oh==null){
                    oh=new Node<>(temp.data);
                    ot=oh;
                }else{
                    ot.next=new Node<>(temp.data);
                    ot=ot.next;
                }
            }
            temp=temp.next;
        }
        if(ot==null){
            return eh;
        }
        if(et==null){
            return oh;
        }
        ot.next=null;
        et.next=null;
        ot.next=eh;
        return oh;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(1);
        Node<Integer> n2=new Node<>(2);
        Node<Integer> n3=new Node<>(3);
        Node<Integer> n4=new Node<>(4);
        Node<Integer> n5=new Node<>(5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        Node<Integer> temp=evenAfterOdd(n1);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
