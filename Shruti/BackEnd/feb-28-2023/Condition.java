import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        int amount = sc.nextInt();

        countNotes(amount);

    }

    //Write a program to count total number of notes in given amount.
  
    static void countNotes(int amt){
        int originalAmt = amt;
        int n2000, n500 ,n200,  n100, n50 , n20 , n10 , n5 ,  n2 , n1 ;

        n2000  = n500 =  n200 = n100 = n50 = n20 =  n10 = n5 = n2 = n1 = 0;

        if(amt >= 2000){
            n2000 = amt/ 2000;
            amt = amt - n2000 * 2000;
        }
        if(amt >= 500){
            n500 = amt / 500;
            amt = amt - n500 * 500;
        }
        if(amt >= 200){
            n200 = amt / 200;
            amt = amt - n200 * 200;
        }
        if(amt >= 100){
            n100 = amt / 100;
            amt = amt - n100 * 100;
        }
        if(amt >= 50){
            n50 = amt / 50;
            amt = amt - n50 * 50;
        }
        if(amt >= 20){
            n20 = amt / 20;
            amt = amt - n20 * 20;
        }
        if(amt >= 10){
            n10 = amt / 10;
            amt = amt - n10 * 10;
        }
        if(amt >= 5){
            n5 = amt / 5;
            amt = amt - n5 * 5;
        }
        if(amt >= 2){
            n2 = amt / 2;
            amt = amt - n2 * 2;
        }
        if(amt >= 1){
            n1 = amt / 1;
            amt = amt - n1 * 1;
        }
        System.out.println( originalAmt + " contains " );
        System.out.println( "2000 notes = "  + n2000);
        System.out.println( "500 notes = "  + n500);
        System.out.println( "200 notes = "  + n200);
        System.out.println( "100 notes = "  + n100);
        System.out.println( "50 notes = "  + n50);
        System.out.println( "20 notes = "  + n20);
        System.out.println( "10 notes = "  + n10);
        System.out.println( "5 notes = "  + n5);
        System.out.println( "2 coins = "  + n2);
        System.out.println( "1 coins = "  + n1);

    }
}
