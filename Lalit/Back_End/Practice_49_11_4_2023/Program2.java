package Practice_49_11_4_2023;

public class Program2 {
    public static void main(String[] args) {

        reverse("Hello world in java");

    }

    public static void reverse(String str){
        int count=0;
        String[] strArray = str.split(" ");

        for (String temp : strArray) {
            count++;
            System.out.println(temp);
        }
        for (int i = 0; i < count; i++) {
            char[] s1 = strArray[i].toCharArray();
            for (int j = s1.length - 1; j >= 0; j--) {
                System.out.print(s1[j]);
            }
            System.out.print(" ");
        }
    }
}
