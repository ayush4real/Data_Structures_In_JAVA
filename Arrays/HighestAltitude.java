package Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};

        int current=0;
        int highest = current;

        for(int i=0;i<gain.length;i++){
            current+=gain[i];
            if(current>highest){
                highest=current;
            }
        }
        System.out.println(highest);
    }
}
