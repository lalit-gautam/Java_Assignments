package Practice13_8_3_2023;

import java.util.Arrays;

public class Problem1And2 {
    public static void main(String[] args) {

        // program to find the character in a string
        String str = "Osama Bin Laden";
        findChar(str, 'B');
        findChar(str, 'b');
        findChar(str, 'n');

        // program to find word in a string
        String str1 = "Lalit kumar Gautam";
        findWord(str1, "Gautam");

    }

    public static void findWord(String str, String word){
        String [] s = str.split(" ");

        boolean flag = false;
        for(int i = 0; i < s.length; i++){
            if(s[i].equals(word)){
                System.out.println("The word : " + word + " is present in the array");
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println("The word : " + word + " is not present in the array");


    }

    public static void findChar(String str, char ch){

        char[] arr = str.toCharArray();

        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ch){
                System.out.println("The character " + ch + " is present in the array at index : " + i);
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println("The character " + ch + " is not present in the array...");

    }
}
