import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int n2 = sc.nextInt();
        System.out.println("Gcd : "+findGCD(n1 , n2));

        List<Integer> arr = new ArrayList<>(Arrays.asList(3, 2, 1, 3,4,4,4,4));

        int ans = findMaxElementCount(arr);
        System.out.println("Maximum element count is : "+ans);
    }
    public static int findGCD(int n1 , int n2){
        int gcd=1;
        for(int i=1;i<=n1 && i<=n2 ; i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        return gcd;
    }


    //Question = https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
    public static int findMaxElementCount(List<Integer> candles) {
        int max=-1;
        int count =0;
        for(int i=0;i<candles.size();i++){
            if(candles.get(i) > max){
                max = candles.get(i);
                count=0;
            }
            if(candles.get(i)==max){
                count++;
            }
        }
        return count;
    }
}
