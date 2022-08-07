package Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image= {{1,1,0},{1,0,1},{0,0,0}};

        for(int i=0;i<image.length;i++){
            int k=0;
            int j=image[i].length-1;
            while(k<j){
                image[i][k]=image[i][k]+image[i][j];
                image[i][j]=image[i][k]-image[i][j];
                image[i][k]=image[i][k]-image[i][j];
//                image[i][k]=image[i][k]^1;
//                image[i][j]=image[i][j]^1;
                k++;
                j--;
            }
//            image[i][k]=image[i][k]^1;
        }

        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                image[i][j]^=1;
            }
        }

        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                System.out.print((image[i][j])+" ");
            }
            System.out.println();
        }
    }
}
