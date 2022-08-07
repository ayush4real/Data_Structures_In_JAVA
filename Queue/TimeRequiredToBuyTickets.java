package Queue;

public class TimeRequiredToBuyTickets {

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int count=0;
        for(int i=0;i<tickets.length;i++){
            if(tickets[i]!=0){
                count+=1;
                tickets[i]=tickets[i]-1;
            }
            if(i==k && tickets[k]==0){
                return count;
            }
            if(i+1==tickets.length){
                i=-1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] tickets={5,1,1,1};
        int k=0;
        System.out.println(timeRequiredToBuy(tickets,k));
    }
}
