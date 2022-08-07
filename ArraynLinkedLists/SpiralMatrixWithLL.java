package ArraynLinkedLists;

import java.util.Arrays;

public class SpiralMatrixWithLL {

    public static int[][] spiralMatrix(int m, int n, Node<Integer> head) {
        Node<Integer> temp=head;
        int[][] arr=new int[m][n];
        for(int[] a:arr ){
            Arrays.fill(a,-1);
        }
        int count=0,v=m*n;
        int rs=0,cs=0,re=m-1,ce=n-1;
        while(count<v){
            int j=cs;
            while(j<=ce){
                if(temp!=null){
                    arr[rs][j]= temp.data;
                    temp=temp.next;
                }
//                else{
//                    arr[rs][j]=-1;
//                }
                j++;
                count++;
            }
            int i=rs+1;
            while(i<=re){
                if(temp!=null){
                    arr[i][ce]= temp.data;
                    temp=temp.next;
                }
//                else{
//                    arr[i][ce]=-1;
//                }
                i++;
                count++;
            }
            j=ce-1;
            while(j>=cs){
                if(temp!=null){
                    arr[re][j]= temp.data;
                    temp=temp.next;
                }
//                else{
//                    arr[re][j]=-1;
//                }
                j--;
                count++;
            }
            i=re-1;
            while(i>rs){
                if(temp!=null){
                    arr[i][cs]= temp.data;
                    temp=temp.next;
                }
//                else{
//                    arr[i][cs]= -1;
//                }
                i--;
                count++;
            }
            rs++;
            cs++;
            ce--;
            re--;
        }
        return arr;
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

    }
}
