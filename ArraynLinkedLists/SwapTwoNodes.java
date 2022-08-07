package ArraynLinkedLists;

public class SwapTwoNodes {

    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        if(i==j){
            return head;
        }
        int a=0;
        Node<Integer> temp=head;
        Node<Integer> prev1=null;
        Node<Integer> prev2=null;
        Node<Integer> n1=null;
        Node<Integer> n2=null;
        Node<Integer> c1=null;
        Node<Integer> c2=null;
        int b=Math.max(i,j);
        int c=Math.min(i,j);
        while (temp!=null && a<=b){
            if(a<=c){
                if(prev1==null){
                    prev1=head;
                    c1=head;
                }else{
                    prev1=c1;
                    c1=temp;
                }
                n1=c1.next;
            }
            else if(a>c && a<=b){
                if(prev2==null){
                    prev2=temp;
                }else{
                    prev2=c2;
                }
                c2=temp;
                n2=c2.next;
            }
            a++;
            temp=temp.next;
        }
        c1.next=null;
        c2.next=null;
        if(c==0){
            c2.next=n1;
            prev2.next=c1;
            c1.next=n2;
            return c2;
        }
        prev1.next=c2;
        c2.next=n1;
        prev2.next=c1;
        c1.next=n2;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(70);
        Node<Integer> n2=new Node<>(80);
        Node<Integer> n3=new Node<>(90);
        Node<Integer> n4=new Node<>(25);
        Node<Integer> n5=new Node<>(65);
        Node<Integer> n6=new Node<>(85);
        Node<Integer> n7=new Node<>(90);
//        Node<Integer> n8=new Node<>(80);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
//        n7.next=n8;
        Node<Integer> temp=swapNodes(n1,0,6);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
