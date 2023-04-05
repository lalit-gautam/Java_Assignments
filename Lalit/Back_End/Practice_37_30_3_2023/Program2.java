package Practice_37_30_3_2023;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {

        // java program to cyclically rotate a given array clockwise by one.\
        int [] array = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(array));

        rotate_array(array);

        System.out.println(Arrays.toString(array));
    }


    static void rotate_array(int [] array)
    {
        int a = array[array.length-1], i;
        for (i = array.length-1; i > 0; i--)
            array[i] = array[i-1];
        array[0] = a;
    }
}
