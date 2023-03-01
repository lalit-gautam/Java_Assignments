import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter a alphabet: ");
        char ch = sc.next().charAt(0);

        checkAlphabet(ch);
    }

    //Write a program to check whether a character is alphabet or not

    static void checkAlphabet(char ch){
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            System.out.println("This is a alphabet");
        } else {
             System.out.println("This is not a alphabet");
        }
    }
}
