package TwoDArrays;

public class OddValueCellsAfterAdding {
    public static void main(String[] args) {
        int[][] indices={{40,5}};
        int m=48,n=37;
        int odd=0;
        int[] arr1=new int[m];
        int[] arr2=new int[n];
        for(int[] index : indices){
            arr1[index[0]]++;
            arr2[index[1]]++;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((arr1[i]+arr2[j])%2!=0){
                    odd++;
                }
            }
        }
        System.out.println(odd);
//        int[][] arr = new int[m][n];
//        int odd=0;
//        for(int i=0;i<indices.length;i++){
//            int val=indices[i][0];
//            for(int j=0;j<n;j++){
//                arr[val][j]++;
//                if(arr[val][j]%2!=0){
//                    odd++;
//                }else if(arr[val][j]%2==0 && odd>0) {
//                    odd--;
//                }
//            }
//            val=indices[i][1];
//            for(int j=0;j<m;j++){
//                arr[j][val]++;
//                if(arr[j][val]%2!=0){
//                    odd++;
//                }else {
//                    odd--;
//                }
//            }
//        }
//        System.out.println(odd);


//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                if(arr[i][j]%2!=0){
//                    odd++;
//                }
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
