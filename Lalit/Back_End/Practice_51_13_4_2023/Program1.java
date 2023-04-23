package Practice_51_13_4_2023;

import java.util.Arrays;
import java.util.List;

public class Program1 {

    // program to convert an array into collection in java
    public static void main(String[] args) {

        String [] playersArray = { "Virat", "Sachin", "Rohit", "Bumrah" };

        Arrays Arrays = null;
        System.out.println("Array input: " + java.util.Arrays.toString(playersArray));


        List<String> playersList = java.util.Arrays.asList(playersArray);

        System.out.println("Converted elements: "
                + playersList);
    }
}
