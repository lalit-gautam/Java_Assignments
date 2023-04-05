package Practice_36_29_3_2023;

public class Program2 {
    public static void main(String[] args) {

        // program to find sub arrays with given sum in an array

        int [] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        subArraySum(arr, n, sum);
    }

    public static void subArraySum(int [] arr, int n, int sum) {
        for (int i = 0; i < n; i++) {
            int currentSum = arr[i];

            if (currentSum == sum) {
                System.out.println("Sum found at index " + i);
                return;
            }
            else {
                for (int j = i + 1; j < n; j++) {
                    currentSum += arr[j];

                    if (currentSum == sum) {
                        System.out.println(
                                "Sum found between indexes " + i
                                        + " and " + j);
                        return;
                    }
                }
            }
        }
        System.out.println("No subarray found");
    }
}
