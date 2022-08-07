package Arrays;

public class RectanglesThatFormLargestSquare {
    public static void main(String[] args) {
        int[][] rectangles= {{2,3},{3,7},{4,3},{3,7}};
        int maxLen=1;
        int c=0;
            for(int i=0;i< rectangles.length;i++){
                int curr=Math.min(rectangles[i][0],rectangles[i][1]);
                if(curr>maxLen){
                    maxLen=curr;
                    c=1;
                } else if (curr==maxLen) {
                    c++;
                }
            }
        System.out.println(c);
    }
}
