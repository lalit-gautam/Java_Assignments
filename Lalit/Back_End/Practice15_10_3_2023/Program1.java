package Practice15_10_3_2023;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program1 {
    public static void main(String [] args){

        // 1. program to remove duplicates elements from the array.
        int [] arr = {3, 3, 3, 56, 23, 5, 56, 9, 67};
        removeDuplicate(arr);
    }

    public static void removeDuplicate(int [] arr) {

        // as we cannot add duplicates objects in set.
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        System.out.println(set);

        }
}
