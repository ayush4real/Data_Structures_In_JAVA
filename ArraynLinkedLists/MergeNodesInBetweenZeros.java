package ArraynLinkedLists;

public class MergeNodesInBetweenZeros {

    public static Node<Integer> mergeNodesAlt(Node<Integer> head){
        Node<Integer> temp=head;
        Node<Integer> prev=head;
        Node<Integer> ref=null;
        int sum=0;
        while(temp!=null){
            if(temp.data==0 && sum!=0){
                prev.data=sum;
//                if(ref==null){
//                    ref=prev;
//                }

                if(temp.next==null){
                    prev.next=null;
                }else{
                    prev.next=temp;
                    prev=prev.next;
                }
                sum=0;
            }else{
                sum+=temp.data;
            }
            temp=temp.next;
        }
        return head;
    }

    public static Node<Integer> mergeNodes(Node<Integer> head) {
        Node<Integer> temp=head;
        Node<Integer> n=null;
        Node<Integer> ref=null;
        int sum=0;

        while(temp!=null){
            if (temp.data == 0) {
                if(sum!=0){
                    if(n==null){
                        n=new Node<>(sum);
                        ref=n;
                    }else{
                        n.next= new Node<>(sum);
                        n=n.next;
                    }
                    sum=0;
                }
            }else{
                sum+=temp.data;
            }
            temp=temp.next;
        }
        return ref;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(0);
        Node<Integer> n2=new Node<>(1);
        Node<Integer> n3=new Node<>(0);
        Node<Integer> n4=new Node<>(3);
        Node<Integer> n5=new Node<>(0);
        Node<Integer> n6=new Node<>(2);
        Node<Integer> n7=new Node<>(2);
        Node<Integer> n8=new Node<>(0);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
        Node<Integer> temp=mergeNodesAlt(n1);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
