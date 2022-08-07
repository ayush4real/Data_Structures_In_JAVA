package ArraynLinkedLists;

public class CheckIsLLPalindromeBetter {

    public static boolean isPalindrome(Node<Integer> head) {
        if(head==null || head.next==null){
            return true;
        }

        Node<Integer> f=head,s=head,prev=null;
        while(f.next!=null && f.next.next!=null){
            prev=s;
            s=s.next;
            f=f.next.next;
        }
        if(f.next==null){
            Node<Integer> revHead=reverseLL(s.next);
            prev.next=null;
            while(revHead!=null && head!=null){
                if(head.data!=revHead.data){
                    return false;
                }
                head=head.next;
                revHead=revHead.next;
            }
        }else{
            Node<Integer> revHead=reverseLL(s.next);
            s.next=null;
            while(revHead!=null && head!=null){
                if(head.data!=revHead.data){
                    return false;
                }
                head=head.next;
                revHead=revHead.next;
            }
        }
        return true;
    }

    public static Node<Integer> reverseLL(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }

        Node<Integer> temp=reverseLL(head.next);
        Node<Integer> revLLHead=head.next;
        revLLHead.next=head;
        head.next=null;
        return temp;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(1);
        Node<Integer> n2=new Node<>(1);
//        Node<Integer> n3=new Node<>(3);
//        Node<Integer> n4=new Node<>(2);
//        Node<Integer> n5=new Node<>(1);
//        Node<Integer> n6=new Node<>(2);
        n1.next=n2;
//        n2.next=n3;
//        n3.next=n4;
//        n4.next=n5;
//        n5.next=n6;
        System.out.println(isPalindrome(n1));
    }
}
