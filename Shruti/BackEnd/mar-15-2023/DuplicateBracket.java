import java.util.Scanner;

public class DuplicateBracket{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            String[] str = input.split("");
            System.out.println(duplicate(str));
        }
    }
    static boolean duplicate(String[] str){
        for (int i = 1; i < str.length; i++) {
            if( str[i-1].equals("(") && str[i].equals("(")){
                return true;
            }
        }
        return false;
    }
}
