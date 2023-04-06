package Practice_37_30_3_2023;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {

        // java array program to segregate all 0s on left side and 1s on right side of the array of
        // 0s and 1s

        int nums[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        int i,  nums_size = nums.length;
        int left = 0, right = nums_size - 1;

        System.out.println("Original Array : "+ Arrays.toString(nums));

        while (left < right)
        {
            /* While  0 at left increment left index  */
            while (nums[left] == 0 && left < right)
                left++;

            /* While we see 1 at right decrement right index*/
            while (nums[right] == 1 && left < right)
                right--;


            if (left < right)
            {
                nums[left] = 0;
                nums[right] = 1;
                left++;
                right--;
            }
        }

        System.out.println("Array after segregation is : "+Arrays.toString(nums));
    }
}
