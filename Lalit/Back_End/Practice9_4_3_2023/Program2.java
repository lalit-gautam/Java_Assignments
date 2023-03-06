package Practice9_4_3_2023;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {

        int [] arr1 = {23, 6, 78, 4};
        int [] arr2 = {23, 6, 78, 4};
        arrayEquals(arr1, arr2);
        // program to check whether 2 arrays are equal or not

    }
    public static void arrayEquals(int [] arr1, int [] arr2){

        boolean flag = false;

        if(arr1.length == arr2.length) {

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    flag = false;
                } else {
                    flag = true;
                }
            }
        }else{
            System.out.println("Both arrays are not equal.");
        }

        if(flag)
            System.out.println("Both arrays are equal");
        else
            System.out.println("Both arrays are not equal.");
    }
}
