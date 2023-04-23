package Practice_50_12_4_2023;

import java.util.ArrayList;
public class Program1 {
    public static void main(String[] args) {

        // Split a String into a Number of Substrings in Java

        String stringInput = new String("The Cat");

        ArrayList<String> subStringList = Program1.splitSubstrings(
                stringInput);

        System.out.println("Substring list printed as an ArrayList : ");
        System.out.println(subStringList);

        System.out.println("All substrings printed 1 per line : ");
        int count = 1;
        for (String it : subStringList) {
            System.out.println("(" + count + ") \"" + it
                    + "\"");
            count++;
        }
    }

    public static ArrayList<String> splitSubstrings(String s){

        int i, j;

        int stringLength = s.length();

        ArrayList<String> subStringList = new ArrayList<String>();

        for (i = 0; i < stringLength; i++) {
            for (j = i + 1; j <= stringLength; j++) {
                subStringList.add(s.substring(i, j));
            }

        }
        return subStringList;
    }

}
