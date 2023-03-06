import java.util.Scanner;

//Write Java program that checks if two arrays contain the same elements
class Assignment1 {
    public static void main(String[] args) {
        int i=0,n,temp,temp1=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Java Program to print first n prime numbers ");
        n= sc.nextInt();
        System.out.println("Prime numbers are before "+n);
        while(temp1<=n){
            temp=0;
            for(i=2;i<=(temp1/2);i++){
                if(temp1%i==0)
                {
                    temp=1;
                    break;
                }
            }
            if(temp==0){
                System.out.println(temp1);
            }
            temp1++;
            }
        } 
}
