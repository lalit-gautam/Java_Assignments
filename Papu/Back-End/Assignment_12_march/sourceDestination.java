public class sourceDestination {
    public static void main(String[] args) {
        reachHome(1, 10);
    }
    public static void reachHome(int source,int destination)
    {
        if(source==destination)
        {
            System.out.println("Reached to home");
            return;
        }
        System.out.println("source  :"+source+"destination :"+destination);
        reachHome(source+1, destination);
    }
}
