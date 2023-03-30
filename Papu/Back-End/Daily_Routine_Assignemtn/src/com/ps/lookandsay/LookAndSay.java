package com.ps.lookandsay;

import java.util.Scanner;

public class LookAndSay {

	public static void main(String[] args) {
		String resultString="1";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the count");
		int n=scanner.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.println(resultString);
			resultString=getLookAndSay(resultString);
		}
	}
	public static String getLookAndSay(String num)
	{
		String string=num+"@";
		String anString="";
		int count=1;
		for(int i=0;i<string.length()-1;i++)
		{
			if(string.charAt(i)!=string.charAt(i+1))
			{
				anString=anString+count+string.charAt(i);
				count=1;
			}
			else {
				count++;
			}
		}
		return anString;
	}

}
