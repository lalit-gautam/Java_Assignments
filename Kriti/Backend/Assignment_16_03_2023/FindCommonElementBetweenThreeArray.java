package Assignment_16_03_2023;

public class FindCommonElementBetweenThreeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {6, 7, 8, 9, 10, 11};
        int[] arr3 = {12, 13, 14, 1, 2, 3, 7, 8, 6};
        findCommonElements(arr, arr2, arr3);
    }

    //    25. Write a Java program to find common elements from three sorted (in non-decreasing order) arrays.
    public static void findCommonElements(int[] arr, int[] arr2, int[] arr3) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    for (int k = 0; k < arr3.length; k++) {
                        if (arr2[j] == arr3[k]) {
                            System.out.print(arr3[k] + "  ");
                            break;
                        }
                    }
                    break;
                }
            }
        }

    }

}
