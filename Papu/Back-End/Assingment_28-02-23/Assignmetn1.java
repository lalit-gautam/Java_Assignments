import java.util.Scanner;

//to input all sides of a tringle and check whether triangle is valid or not
public class Assignmetn1
{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the sides of the tringle");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      sc.close();
      if(a+b>c && a+c>b && b+c>a)
      {
        System.out.println(" it is a triangle");
      }
      else{
        System.out.println("is not a triangle");
      }
    }
}