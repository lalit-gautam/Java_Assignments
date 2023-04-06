import java.util.Scanner;
public class LookNSay {
    public static void main(String[] args) {
        String ans = "1";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sequence Count : ");
        int n = sc.nextInt();
        System.out.println("Sequence is : ");
        for (int i = 1; i <= n; i++) {
            System.out.println(ans);
            ans = printSequence(ans);
        }
        sc.close();
    }
    public static String printSequence(String num) {
        String str = num ;
        String ans = "";
        int count = 1;
        for (int i = 1; i <= str.length() ; i++) {
            if(i==str.length()){
                ans = ans + count + str.charAt(i-1);
                break;
            }
            if (str.charAt(i-1) != str.charAt(i)) {
                ans = ans + count + str.charAt(i-1);
                count = 1;
            } else {
                count++;
            }
        }
        return ans;
    }
}