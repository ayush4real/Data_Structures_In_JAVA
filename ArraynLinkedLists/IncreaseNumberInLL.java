package ArraynLinkedLists;

public class IncreaseNumberInLL {

    private static Node<Integer> carry=new Node<>(1);

    public static Node<Integer> increaseH(Node<Integer> head){
        if(head==null){
            return null;
        }
        Node<Integer> temp=incVal(head.next);
        if(carry.data!=0){
            if(head.data==9){
                Node<Integer> newH=new Node<>(1);
                head.data=0;
                newH.next=head;
                return newH;
            }else{
                head.data+=1;
                return head;
            }
        }
        return head;
    }

    public static Node<Integer> incVal(Node<Integer> head){
        if(head==null){
            return null;
        }
        if(head.next==null){
            if  (head.data==9){
//                if(carry.data==1){
                    head.data=0;
//                }
            }else{
                head.data=head.data+1;
                carry.data=0;
            }
            return head;
        }
        incVal(head.next);
        if(head.data==9){
            if(carry.data==1){
                head.data=0;
            }
        }else{
            if(carry.data==1){
                head.data+=1;
                carry.data=0;
            }
        }
        return head;
    }

    public static Node<Integer> reverseLL(Node<Integer> head){
        if(head.next==null){
            return head;
        }

        Node<Integer> curr=head,prev=null;
        while(curr!=null){
            Node<Integer> temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    public static Node<Integer> increaseNumInLL(Node<Integer> head){
        head=reverseLL(head);
        Node<Integer> temp=head;
        int carry=1;
        while(temp!=null){
            int sum=temp.data+carry;
            temp.data=sum%10;
            carry=sum/10;
            temp=temp.next;
        }
        if(carry==1){
            temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            Node<Integer> newN=new Node<>(1);
            temp.next=newN;
        }

        return reverseLL(head);
    }

    public static void main(String[] args) {
        Node<Integer> n1=null;
//        Node<Integer> n2=new Node<>(9);
//        Node<Integer> n3=new Node<>(9);
//        Node<Integer> n4=new Node<>(9);
//        n1.next=n2;
//        n2.next=n3;
//        n3.next=n4;
//        n4.next=n5;
//        n5.next=n6;
        Node<Integer> temp=increaseH(n1);
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
