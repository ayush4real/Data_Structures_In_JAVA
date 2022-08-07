package Stack;

public class CrawlerLogFolder {

    public static int minOperations(String[] logs) {
        int op=0;
        for(String s: logs){
            if(s.equals("../") && op!=0){
                op--;
            }else if (!s.equals("./") && !s.equals("../")){
                op++;
            }
        }
        return op;
    }

    public static void main(String[] args) {
        String[] o={"./","../","./"};
        System.out.println(minOperations(o));
    }
}
