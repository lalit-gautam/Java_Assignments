package Practice_48_10_4_2023;

public class Program1 {
    public static void main(String[] args) {

        // Program to find the common elements from the three sorted arrays
        int [] arr1 = { 13, 15, 10, 20, 49};
        int [] arr2 = { 15, 7, 20, 80, 100 };
        int [] arr3 = { 3, 4, 15, 20, 30, 70};
        commonElement(arr1, arr2, arr3);
    }

    public static void commonElement(int [] arr1, int [] arr2, int [] arr3) {

        int length1 = arr1.length;
        int length2 = arr2.length;
        int length3 = arr3.length;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < length1 && j < length2 && k < length3) {

            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
    }
}
