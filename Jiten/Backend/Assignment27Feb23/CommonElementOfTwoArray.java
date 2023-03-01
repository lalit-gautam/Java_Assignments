package Assignment27Feb23;

// Find the common elements between two arrays of integers.

public class CommonElementOfTwoArray {
	public static void main(String[] args) {
		int []array1 = {34567,452,32,23,432,42,34,6789};
		int []array2 = {555,87,358,8754,635,977,32,432,655,9852,23};
		
		System.out.println("Duplicate elements are : ");
		for(int firstArray = 0; firstArray < array1.length; firstArray++) {
			for(int secArray = 0; secArray < array2.length; secArray++) {
				if(array1[firstArray] == array2[secArray])
					System.out.println(array1[firstArray]);
			}
		}
	}
}
