package Practice6_28_2_2023;

public class Program1 {
    public static void main(String[] args) {

        // Program to check whether a character is uppercase or lowercase alphabet
        checkCase('A');
        checkCase('c');
        checkCase('$');
    }

    public static void checkCase(char ch){

            if (ch >= 'A' && ch <= 'Z')
                System.out.println(ch + " is an UpperCase character");

            else if (ch >= 'a' && ch <= 'z')
                System.out.println(ch + " is an LowerCase character" );

            else
                System.out.println(ch + " is not an alphabetic character" );
    }
}
