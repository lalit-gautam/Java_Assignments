package Practice_50_12_4_2023;

public class Program2 {
    public static void main(String[] args) {

        // Check if a given string is Pangram in Java
        String str = "Abcdefghijklmnopqrstuvwxyz";
        allLetter(str);
    }

    public static void allLetter(String str) {

        str = str.toLowerCase();
        boolean allLetterPresent = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {

            if (!str.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }

        if (allLetterPresent)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
