package Practice5_27_2_2023;

public class Program1 {
    public static void main(String[] args) {

        // calculate the number of characters of the string
        String str = "Lalit Gautam";
        countChar(str);
    }

    public static void countChar(String string){
        int count = 0;

        //Counts each character except space
        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ')
                count++;
        }

        System.out.println("Total number of characters in a string: " + count);
    }
}
