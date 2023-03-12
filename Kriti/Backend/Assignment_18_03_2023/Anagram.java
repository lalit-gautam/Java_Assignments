package Assignment_18_03_2023;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str = "abcdef";
        String str2 = "fedcba";
        System.out.println(checkAnagram(str , str2));
    }
    public static boolean checkAnagram(String str , String s){
        String[] strArr = str.split("");
        String[] sArr = s.split("");
        Arrays.sort(strArr);
        Arrays.sort(sArr);
        return Arrays.toString(strArr).equals(Arrays.toString(sArr));
    }
}
