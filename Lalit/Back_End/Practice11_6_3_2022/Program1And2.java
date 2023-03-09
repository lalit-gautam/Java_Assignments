package Practice11_6_3_2022;

public class Program1And2 {
    public static void main(String[] args) {

        // 1. program to find the number of character occurrences in a string
        String str = "Ram prasad Verma";
        characterCount(str, "r");
        characterCount(str, "a");

        // 2.. program to count number of words in a string
        String str1 = "JAVA is an Object Oriented Programming Language";
        wordCount(str1);
    }

    public static void characterCount(String str, String character){
        str = str.toLowerCase();

        int length_of_string = str.length();
        int replace_count = str.replace(character, "").length();

        int element_length = length_of_string - replace_count;
        System.out.println(character + " number of occurrences : " + element_length);
    }

    public static void wordCount(String str){
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                ++count;
            }
        }
        System.out.println("Total words in the string : " + count);
    }
}
