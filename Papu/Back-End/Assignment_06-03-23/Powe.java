public class Powe {
    public static void main(String[] args) {
        System.out.println(Power(2, 8));
    }
    public static int Power(int base,int com)
    {
        if(com==0)
        {
            return 1;
        }
        return base*Power(base,com-1);
    }
}
