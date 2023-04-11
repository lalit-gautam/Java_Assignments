package Practice_46_8_4_2023;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {

        // java program to check if an array of integers without 0 and -1.
        int [] arr = {50, 77, 12, 54, -11};
        System.out.println(Arrays.toString(arr));
        System.out.println(test(arr));
    }



    public static boolean test(int [] arr){
        for(int element : arr){
            if(element == 0 || element == -1){
                return  false;
            }
        }
        return true;
    }
}
