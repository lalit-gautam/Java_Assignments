package Practice_40_2_4_2023;

public class Program2 {
    public static void main(String[] args) {

        // Write a Java program to compare two strings lexicographically.
        String str1 = "This is String 1";
        String str2 = "This is String 2";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        int result = str1.compareTo(str2);

        if (result < 0)
        {
            System.out.println(" " + str1 + " " + " is less than " + " " + str2 + " ");
        }
        else if (result == 0)
        {
            System.out.println(" " + str1 + " " + " is equal to " + " " + str2 + " ");
        }
        else //
        {
            System.out.println(" " + str1 + " " + " is greater than " + " " + str2 + " ");
        }
    }
}
