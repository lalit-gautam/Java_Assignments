import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.print(reverse(n));
    }
    static int rev = 0;
    static int reverse(int n){
        
        if(n == 0){
            return rev;
        }
        int rem = n % 10;
        rev = (rev*10) + rem;       

        return reverse(n / 10);

    }
}
