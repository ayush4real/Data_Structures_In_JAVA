package ArraynLinkedLists;

import Arrays.MinNumOfMovesToSeatEveryone;

public class kReverseLL {

    public static int len(Node<Integer> head){
        int l=0;
        Node<Integer> temp=head;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        return l;
    }

    public static Node<Integer> reverseLLIter(Node<Integer> head){
        Node<Integer> prev=null, curr=head;
        while(curr!=null){
            Node<Integer> temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    public static Node<Integer> kReverse(Node<Integer> head, int k){
        if(k>=len(head)){
            return reverseLLIter(head);
        }

        Node<Integer> tempHead=head;

        for(int i=1;i<k;i++){
            head=head.next;
        }

        Node<Integer> nextLLHead=head.next;
        head.next=null;
        Node<Integer> newHead=reverseLLIter(tempHead);
        Node<Integer> tail=tempHead;
        Node<Integer> newNextLLHead=kReverse(nextLLHead,k);
        tail.next=newNextLLHead;
        return newHead;
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
        Node<Integer> temp=kReverse(n1,3);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
