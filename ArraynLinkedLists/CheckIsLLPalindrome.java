package ArraynLinkedLists;

public class CheckIsLLPalindrome {

    public static boolean isPalindrome(Node<Integer> head) {

        if(head==null || head.next==null){
            return true;
        }
        StringBuilder sb=new StringBuilder();
        Node<Integer>temp =head;
        while(temp!=null){
            sb.append(temp.data);
            temp=temp.next;
        }
        String s=sb.toString();
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(1);
        Node<Integer> n2=new Node<>(3);
        Node<Integer> n3=new Node<>(7);
        Node<Integer> n4=new Node<>(3);
        Node<Integer> n5=new Node<>(1);
//        Node<Integer> n6=new Node<>(3);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        System.out.println(isPalindrome(n1));
    }
}
