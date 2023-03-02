package Practice5_27_2_2023;

public class Program2 {
    public static void main(String[] args) {

        reverseString("Lalit Gautam");
        reverse("Shyam Shundar");
    }

    public static void reverseString(String string){

        String reversed = "";
        int length = string.length();

        for(int i = length-1; i >= 0; i--){
            reversed = reversed + string.charAt(i);
        }

        System.out.println("Original string: " + string);
        System.out.println("Reverse of given string: " + reversed);
    }

    public static void reverse(String string){
        StringBuffer sb = new StringBuffer(string);
        System.out.println("Original String : " + string);
        System.out.println( "Reversed String : " + sb.reverse());
    }
}
