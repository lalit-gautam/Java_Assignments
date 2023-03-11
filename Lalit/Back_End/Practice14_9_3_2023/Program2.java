package Practice14_9_3_2023;

public class Program2 {
    public static void main(String[] args) {

        String str = "Osama Bin Laden";
        reverse(str);

        String str1 = "Vladivostok";
        reverse(str1);

    }
    public static void reverse(String str){

        int length_of_string = str.length();
        String reverseString = "";

        for(int i = length_of_string - 1; i >= 0; i--){
            reverseString = reverseString + str.charAt(i);
        }
        System.out.println(reverseString);
    }
}
