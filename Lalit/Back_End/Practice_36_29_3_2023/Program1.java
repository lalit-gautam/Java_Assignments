package Practice_36_29_3_2023;

import java.util.HashMap;

public class Program1 {
    public static void main(String[] args) {

        String str = "Lalit Gautam";
        // program to count number of characters in a string using HashMap

        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = str.length() - 1; i >= 0; i--)
        {
            if(charCount.containsKey(str.charAt(i)))
            {
                int count = charCount.get(str.charAt(i));
                charCount.put(str.charAt(i), ++count);
            }
            else
            {
                charCount.put(str.charAt(i),1);
            }
        }
        System.out.println(charCount);
    }
}
