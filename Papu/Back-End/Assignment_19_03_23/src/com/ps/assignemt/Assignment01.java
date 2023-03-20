package com.ps.assignemt;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		int aLen = array1.length;
		int bLen = array2.length;
		int[] result = new int[aLen + bLen];
		System.out.println(result.length);
		for (int i = 0; i < result.length; i++) {
			if (i < array1.length) {
				result[i] = array1[i];
			} else {
				result[i] = array2[i%array1.length];
			}
		}
		System.out.println("The new Array is::");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "   ");
		}

	}
}
