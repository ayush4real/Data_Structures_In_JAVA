package TwoDArrays;

public class MinTimeToVisitAllPointsInCoordinateSystem {
    public static void main(String[] args) {
        int points[][]={{0,0},{2,4}};
        int x=points[0][0],y=points[0][1], sec=0;
        for(int i=1;i<points.length;){
            if(points[i][0]==x && points[i][1]==y){
                i++;
            } else if (points[i][0]<x && points[i][1]<y){
                x-=1;
                y-=1;
                sec+=1;
            } else if (points[i][0]==x && points[i][1]>y) {
                y+=1;
                sec+=1;
            } else if (points[i][1]==y && points[i][0]>x) {
                x+=1;
                sec+=1;
            } else if (points[i][0]>x && points[i][1]>y) {
                x+=1;
                y+=1;
                sec+=1;
            } else if (points[i][0]==x && points[i][1]<y) {
                y-=1;
                sec+=1;
            } else if (points[i][1]==y && points[i][0]<x) {
                x-=1;
                sec+=1;
            }
        }
        System.out.println(sec);
    }
}
