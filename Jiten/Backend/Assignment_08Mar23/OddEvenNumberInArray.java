package Assignment_08Mar23;

//Java Program to print Odd and Even Numbers from an Array


public class OddEvenNumberInArray {
	public static void main(String args[]) {
		int numbers[] = { 1, 2, 5, 6, 3, 2 ,1,453,123,12,104};
		System.out.println("Odd Numbers:");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 != 0) {
				System.out.println(numbers[i]);
			}
		}
		System.out.println("Even Numbers:");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println(numbers[i]);
			}
		}
	}
}
