package com.ps.assignemt;

public class Assignment01 {
	static boolean isMirrorInverse(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			// If condition fails for any element
			if (arr[arr[i]] != i)
				return false;
		}
		// Given array is mirror-inverse
		return true;
	}

	public static void main(String[] args) {
		int arr[] = {3,4,2,0,1};
		if (isMirrorInverse(arr))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
//In the given array:
//index(0) -> value(3)
//index(1) -> value(4)
//index(2) -> value(2)
//index(3) -> value(0)
//index(4) -> value(1)
//To find the inverse of the array, swap the index and the value of the array.
//index(3) -> value(0)
//index(4) -> value(1)
//index(2) -> value(2)
//index(0) -> value(3)
//index(1) -> value(4)
