package Practice_51_13_4_2023;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program2 {
    public static void main(String[] args) {

        // Convert Set of String to Array of String in Java
        Set<String> setOfString = new HashSet<>(Arrays.asList("Hello",
                        "this",
                        "is Computer Science"));

        System.out.println("Set of String: " + setOfString);

        String[] arrayOfString = convert(setOfString);

        System.out.println("Array of String: " + Arrays.toString(arrayOfString));
    }

    public static String[] convert(Set<String> setOfString) {

        String[] arrayOfString = new String[setOfString.size()];

        int index = 0;
        for (String str : setOfString)
            arrayOfString[index++] = str;

        return arrayOfString;
    }
}
