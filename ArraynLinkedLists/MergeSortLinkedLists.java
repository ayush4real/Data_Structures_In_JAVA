package ArraynLinkedLists;

public class MergeSortLinkedLists {

    public static Node<Integer> mergeSort(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> mid1=midPoint(head);
        Node<Integer> mid2=mid1.next;
        mid1.next=null;

        Node<Integer> head1= mergeSort(head);
        Node<Integer> head2= mergeSort(mid2);
        Node<Integer> fHead= mergeTwoSortedLinkedLists(head1,head2);

        return fHead;
    }

    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }

        Node<Integer> t1=head1;
        Node<Integer> t2=head2;
        Node<Integer> head=null;
        Node<Integer> prev=null;

        while(t1!=null && t2!=null){
            if(t1.data<t2.data){
                if(head==null){
                    head=t1;
                    prev=t1;
                    t1=t1.next;
                }else{
                    prev.next=t1;
                    prev=t1;
                    t1=t1.next;
                }
            }else{
                if(head==null){
                    head=t2;
                    prev=t2;
                    t2=t2.next;
                }else{
                    prev.next=t2;
                    prev=t2;
                    t2=t2.next;
                }
            }
        }
        if(t1==null){
            prev.next=t2;
        } else if (t2==null) {
            prev.next=t1;
        }
        return head;
    }
    public static Node<Integer> midPoint(Node<Integer> head) {

        if(head==null) return head;

        Node<Integer> s=head;
        Node<Integer> f=head;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(4);
        Node<Integer> n2=new Node<>(6);
        Node<Integer> n3=new Node<>(9);
        Node<Integer> n4=new Node<>(5);
        Node<Integer> n5=new Node<>(1);
        Node<Integer> n6=new Node<>(2);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        Node<Integer> temp=mergeSort(n1);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
