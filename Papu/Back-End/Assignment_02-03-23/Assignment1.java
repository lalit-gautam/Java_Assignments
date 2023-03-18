import java.util.Scanner;

//factorial of a number using recursion
class Assignment1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        sc.close();
        if(fact(n)>=0)
        {
            System.out.println("Factorial:"+fact(n));
        }
        else{
            System.out.println("Factorial is not possible");
        }
    }
    public   static int fact(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        else if(n<0)
        {
            return -1;
        }
        else {
            return n*fact(n-1);
        }
    
    }
}