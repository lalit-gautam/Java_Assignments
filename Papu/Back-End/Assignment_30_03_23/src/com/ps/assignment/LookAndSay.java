package com.ps.assignment;

import java.util.HashMap;

public class LookAndSay {

	public static void main(String[] args) {
		int N = 5;
		System.out.println(countnndSay(N));
	}

	static String countnndSay(int n) {
		String res = "1"; // res variable keep tracks of string
		// from 1 to n-1

		// For loop iterates for n-1 time and generate strings
		// in sequence "1" -> "11" -> "21" -> "1211"
		for (int i = 1; i < n; i++) {
			res = generator(res);
		}

		return res;
	}

	static String generator(String str) {
		String ans = "";

		HashMap<Character, Integer> tempCount = new HashMap<>();

		for (int i = 0; i < str.length() + 1; i++) {
			if (i == str.length() || tempCount.containsKey(str.charAt(i)) == false && i > 0) {
				ans += String.valueOf(tempCount.get(str.charAt(i - 1))) + str.charAt(i - 1);
				tempCount.clear();
			}

			if (i == str.length()) {
				tempCount.put(null, 1);
			} else {
				if (tempCount.containsKey(str.charAt(i))) {
					tempCount.put(str.charAt(i), tempCount.get(str.charAt(i)) + 1);
				} else {
					if (i != str.length())
						tempCount.put(str.charAt(i), 1);
				}
			}
		}
		return ans;
	}

}
