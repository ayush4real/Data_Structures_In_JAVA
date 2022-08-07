package ArraynLinkedLists;

public class BinaryInLLToDecimal {
    static int count=0;
    static double ans=0;
    public static int getDecimalValue(Node<Integer> head){
        helper(head);
        return (int) ans;
    }
    public static int helper(Node<Integer> head) {
        if(head==null){
            return 0;
        }
        int e=helper(head.next);
        ans+=head.data*Math.pow(2,e);
        return e+1;
    }

    public static void main(String[] args) {
        Node<Integer> n1=new Node<>(1);
        Node<Integer> n2=new Node<>(0);
        Node<Integer> n3=new Node<>(0);
        Node<Integer> n4=new Node<>(1);
        Node<Integer> n5=new Node<>(0);
        Node<Integer> n6=new Node<>(0);
        Node<Integer> n7=new Node<>(1);
        Node<Integer> n8=new Node<>(1);
        Node<Integer> n9=new Node<>(1);
        Node<Integer> n10=new Node<>(0);
        Node<Integer> n11=new Node<>(0);
        Node<Integer> n12=new Node<>(0);
        Node<Integer> n13=new Node<>(0);
        Node<Integer> n14=new Node<>(0);
        Node<Integer> n15=new Node<>(0);

//        Node<Integer> n4=new Node<>(40);
//        Node<Integer> n5=new Node<>(50); [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
        n8.next=n9;
        n9.next=n10;
        n10.next=n11;
        n11.next=n12;
        n12.next=n13;
        n13.next=n14;
        n14.next=n15;
//        n3.next=n4;
//        n4.next=n5;
        System.out.println(getDecimalValue(n1));
    }
}
