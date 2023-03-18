package Assignment_17_03_2023;

public class FindTriplets {
    public static void main(String[] args) {
        int[] nums = {1, 6, 3, 0, 8, 4, 1, 7};
        printAllTriplets(nums , 7);
    }

    //Write a Java program to find all triplets equal to a given sum in a unsorted array of integers.
    public static void printAllTriplets(int[] arr, int n) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == n) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    }
                }
            }
        }
    }

}
