package Practice_41_3_4_2023;

public class Program1 {
    public static void main(String[] args) {

        // Write a Java program to find maximum difference between two elements in a given array of integers such
        // that smaller element appears before larger element.
        int[] nums = { 2, 3, 1, 7, 9, 5, 11, 3, 5 };
        System.out.println(diffBetweenTwoElements(nums));

    }

    public static int diffBetweenTwoElements(int[] nums)
    {
        int diff_two_elemnts = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                diff_two_elemnts = Integer.max(diff_two_elemnts,nums[j] - nums[i]);
            }
        }

        return diff_two_elemnts;
    }
}
