package Practice27_20_3_2023;

public class Program1 {
    public static void main(String[] args) {

            String str = "Welcome to Java";
            reverseEachWordInString(str);

    }

    public static void reverseEachWordInString(String str) {

        String [] words = str.split(" ");
        String reverseString = "";

        for(String w : words){
            String reverseWord = "";
            for(int i = w.length() - 1; i >= 0; i--) {
                reverseWord = reverseWord + w.charAt(i);
            }

            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println(reverseString);
    }

}
