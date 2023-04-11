package Practice_46_8_4_2023;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {

        int [] arr = {77, 77, 65, 65, 77};
        System.out.println(Arrays.toString(arr));

        System.out.println(result(arr, 77, 65));

    }

    public static boolean result(int[] arr, int num1, int num2) {
        for (int number : arr) {
            boolean r = number != num1 && number != num2;
            if (r) {
                return false;
            }
        }
        return true;
    }
}
