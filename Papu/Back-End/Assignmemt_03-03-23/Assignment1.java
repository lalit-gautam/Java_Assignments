//Write a Java program to check if a vowel is present in a string
import java.util.Scanner;

class Assignment1
{
    public static void main(String[] args) {
       System.out.println(stringContainsVowels("hellwoe"));
        
    }
    public static boolean stringContainsVowels(String str)
    {
      str=str.toLowerCase();
      for(int i=0;i<str.length();i++)
      {
        if((str.charAt(i)=='a')|| (str.charAt(i)=='u') || (str.charAt(i)=='o')|| (str.charAt(i)=='i')||(str.charAt(i)=='e'))
            {
                return true;
            }
      }
      return false;
    }
}