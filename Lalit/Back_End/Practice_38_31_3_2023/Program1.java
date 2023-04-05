package Practice_38_31_3_2023;

public class Program1 {
    public static void main(String[] args) {

        // program to find teh duplicate character in a string
        String str = "Shyam Shundar";
        duplicateCharCount(str);
    }

    public static void duplicateCharCount(String str){
        int count;
        char [] string = str.toCharArray();

        System.out.println("Duplicate characters in a given string: ");

        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ') {
                    count++;

                    string[j] = '0';
                }
            }

            if(count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }
    }
}
