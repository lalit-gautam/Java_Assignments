package Practice18_14_3_2023;

public class Program2 {
    public static void main(String[] args) {

        // count number of words in a string
        String str = "Java is an Object Oriented Programming Language";
        wordCount(str);
    }

    public static void wordCount(String str){

        String [] str1 = str.split(" ");

        int count = 0;
        for(int i = 0; i < str1.length; i++){
            count++;
            System.out.println("Words are : " + str1[i] + " ---- > " + count);
        }
        System.out.println("Total words in the string : " + count);
    }
}
