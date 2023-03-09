//Write a Java Program to reverse the letters present in the given String.
public class Assignment2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "Wel come to Bipros";
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
