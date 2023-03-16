//to program to convert decimal to binary form
class Assignement1
{
    public static void main(String[] args) {
        int number=255;
        while(number>0)
        {
            if(number%2==0)
            {
                System.out.print("0");
            }
            else{
                System.err.print("1");
            }
            number=number/2;
        }
    }
}