package Practice_40_2_4_2023;

public class Program1 {
    public static void main(String[] args) {

        // Write a Java program to get the character (Unicode code point) at the given index within the String.

        String str = "Java is an object oriented programming language";
        System.out.println("Original String : " + str);

        int val1 = str.codePointAt(1);

        int val2 = str.codePointAt(9);

        // prints character at index1 in string
        System.out.println("Character(unicode point) = " + val1);
        // prints character at index9 in string
        System.out.println("Character(unicode point) = " + val2);
    }
}
