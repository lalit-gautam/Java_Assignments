package Assignment_18_13_03_2023;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

//        System.out.println(new StringBuilder(new Scanner(System.in).nextLine()).reverse());

        System.out.print("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        System.out.println(reverseStr(data));
    }
    public static  String reverseStr(String str){
        String[] st = str.split("");
        String sum ="";
        for(String s:st){
            sum = s+ sum;
        }
        return sum;
    }
}
