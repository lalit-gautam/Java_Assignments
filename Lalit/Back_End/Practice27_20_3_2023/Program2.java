package Practice27_20_3_2023;

public class Program2 {
    public static void main(String[] args) {

        // to print the character occurances in a string

        String str = "Object Oriented Programming Language";
        charCount(str, "a");
        charCount(str, "o");
        charCount(str, "m");
    }

    public static void charCount(String str, String countElement) {

        str = str.toLowerCase();
        int length_og_String = str.length();
        int replace_count = str.replace(countElement, "").length();

        int element_length = length_og_String - replace_count;
        System.out.println(countElement + " number of occurrences : " + element_length);
    }


}
