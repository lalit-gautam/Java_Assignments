
import java.util.*;
public class Armstrong {
    public static void main (String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to check Armstrong or not: ");
            int n = sc.nextInt();

            int t1 = n;
            int noOfDigit = 0;

            
            //no. of digits
            while(t1 != 0){
                t1 = t1/10; //123
                noOfDigit = noOfDigit + 1;
            }

            int t2 = n;
            int arm = 0;
            int rem;
            // multiplying the digits the no. of times total digits present in the number
            // and sum of those multiplied digits
            while(t2 != 0){
                int mul = 1;
                rem = t2 % 10;
                for(int i = 1; i <= noOfDigit; i++){
                    mul = mul * rem; 
                }
                arm = arm + mul;
                t2 = t2 / 10;
            }
            if (arm == n){
               System.out.println("This is an armstrong number");
            } else {
                System.out.println("This is not an armstrong number");
            }
        }
    }


    
}

