import java.util.*;
public class Reversestring {
    public static void main(String args[]){
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            int length = name.length();
            String rev = "";

            for(int i = length - 1 ; i >= 0 ; i--){
                rev = rev + name.charAt(i);
            }

            System.out.println("Your reverse name is "+ rev);

            if(rev.equals(name)){
                System.out.println("This is a pallindrome");
            } else {
                System.out.println("not pallindrome");
            }
        }
    }
    
}
