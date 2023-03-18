//To determine whether two string are the anagram
package com.ps.assignment;

import java.util.Arrays;

public class Assignment01 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="ollhe";
		if(isAnagram(s1, s2))
		{
			System.out.println("is anagram");
		}
		else {
			System.out.println("is not a anagram number");
		}
	}
	public static boolean isAnagram(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()!=s2.length())
		{
			return false;
		}
		else {
			char[] string1=s1.toCharArray();
			char[] string2=s2.toCharArray();
			Arrays.sort(string1);
			Arrays.sort(string2);
			if(Arrays.equals(string1, string2)==true)
			{
				return true;
			}
			else {
				return false;
			}
		}
	}

}
