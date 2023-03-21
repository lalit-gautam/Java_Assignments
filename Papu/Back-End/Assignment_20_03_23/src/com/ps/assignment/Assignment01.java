package com.ps.assignment;

import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ente the number::");
		int number=scanner.nextInt();
		if(number==0)
		{
			System.out.println("zero");
		}
		else {
			System.out.println("Number in words:::"+numberToWord(number));
		}
	}
	public static String numberToWord(int a)
	{
		String wordsString="";
		String unitarray[]= {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String tensArray[]= {"zero","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		if(a<0)
		{
			String numberString=""+a;
			numberString=numberString.substring(1);
			return "minus"+numberToWord(Integer.parseInt(numberString));
		}
		if((a/1000000)>0)
		{
			wordsString=wordsString+numberToWord(a/1000000)+"Million ";
			a=a%1000000;
		}
		if((a/1000)>0)
		{
			wordsString=wordsString+numberToWord(a/1000)+"thousand ";
			a=a%1000;
		}
		if((a/100)>0)
		{
			wordsString=wordsString+numberToWord(a/100)+"Hundred ";
			a=a%100;
		}
		if(a>0)
		{
			if(a<20)
			{
				wordsString=wordsString+unitarray[a]+" ";
			}
			else {
				wordsString=wordsString+tensArray[a/10];
				if(a%10>0)
				{
					wordsString=wordsString+" "+unitarray[a%10];
				}
			}
		}
		return wordsString;
		
	}

}
