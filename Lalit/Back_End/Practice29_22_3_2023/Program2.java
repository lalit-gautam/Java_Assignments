package Practice29_22_3_2023;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {

        // program to add an element at particular index
        int [] arr = {8, 9, 6, 87};
        addElementAtIndex(arr, 2, 1000);
//        System.out.println(Arrays.toString(arr));
    }

    public static void addElementAtIndex(int [] arr, int index, int element) {
        int [] new_Array = new int[arr.length + 1];

        for(int i = 0; i < arr.length + 1; i++){
            if(i < index)
                new_Array[i] = arr[i];
            else if(i == index)
                new_Array[i] = element;
            else
                new_Array[i] = arr[i - 1];
        }
        System.out.println(Arrays.toString(new_Array));
    }
}
